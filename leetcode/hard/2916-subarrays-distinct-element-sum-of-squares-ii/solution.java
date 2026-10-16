
class Solution {
    static final int MOD = 1_000_000_007;

    long[] sum;
    long[] square;
    long[] lazy;
    int n;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        square = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int prev = last[nums[i]];

            // Add 1 to the distinct count of affected subarrays.
            update(1, 0, n - 1, prev, i, 1);

            ans = (ans + square[1]) % MOD;
            last[nums[i]] = i + 1;
        }

        return (int) ans;
    }

    void update(int node, int l, int r,
                int ql, int qr, long val) {
        if (ql > r || qr < l) return;

        if (ql <= l && r <= qr) {
            apply(node, l, r, val);
            return;
        }

        push(node, l, r);

        int mid = (l + r) / 2;

        update(node * 2, l, mid, ql, qr, val);
        update(node * 2 + 1, mid + 1, r, ql, qr, val);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        square[node] = (square[node * 2]
                      + square[node * 2 + 1]) % MOD;
    }

    void apply(int node, int l, int r, long val) {
        val %= MOD;

        long len = r - l + 1L;
        long oldSum = sum[node];

        square[node] = (square[node]
                + 2L * val % MOD * oldSum % MOD
                + len % MOD * val % MOD * val % MOD) % MOD;

        sum[node] = (oldSum + len * val) % MOD;
        lazy[node] = (lazy[node] + val) % MOD;
    }

    void push(int node, int l, int r) {
        if (lazy[node] == 0 || l == r) return;

        int mid = (l + r) / 2;

        apply(node * 2, l, mid, lazy[node]);
        apply(node * 2 + 1, mid + 1, r, lazy[node]);

        lazy[node] = 0;
    }
}
