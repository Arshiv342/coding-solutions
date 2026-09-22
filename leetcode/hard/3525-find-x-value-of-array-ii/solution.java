class Solution {

    int k;

    class Node {
        int product;
        int[] count;

        Node() {
            product = 1;
            count = new int[k];
        }
    }

    Node[] tree;

    void build(int node, int l, int r, int[] nums) {
        tree[node] = new Node();

        if (l == r) {
            int val = nums[l] % k;
            tree[node].product = val;
            tree[node].count[val] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid, nums);
        build(node * 2 + 1, mid + 1, r, nums);

        merge(node);
    }

    void merge(int node) {
        Node left = tree[node * 2];
        Node right = tree[node * 2 + 1];
        Node cur = tree[node];

        cur.product = (left.product * right.product) % k;

        for (int i = 0; i < k; i++) {
            cur.count[i] = left.count[i];
        }

        for (int i = 0; i < k; i++) {
            int newRem = (left.product * i) % k;
            cur.count[newRem] += right.count[i];
        }
    }

    void update(int node, int l, int r, int index, int value) {
        if (l == r) {
            value %= k;

            tree[node].product = value;

            for (int i = 0; i < k; i++) {
                tree[node].count[i] = 0;
            }

            tree[node].count[value] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, r, index, value);
        }

        merge(node);
    }

    Node query(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) {
            return tree[node];
        }

        int mid = (l + r) / 2;

        if (qr <= mid) {
            return query(node * 2, l, mid, ql, qr);
        }

        if (ql > mid) {
            return query(node * 2 + 1, mid + 1, r, ql, qr);
        }

        Node left = query(node * 2, l, mid, ql, qr);
        Node right = query(node * 2 + 1, mid + 1, r, ql, qr);

        return combine(left, right);
    }

    Node combine(Node left, Node right) {
        Node res = new Node();

        res.product = (left.product * right.product) % k;

        for (int i = 0; i < k; i++) {
            res.count[i] = left.count[i];
        }

        for (int i = 0; i < k; i++) {
            int rem = (left.product * i) % k;
            res.count[rem] += right.count[i];
        }

        return res;
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;

        int n = nums.length;
        tree = new Node[4 * n];

        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

           
            update(1, 0, n - 1, index, value);

            
            Node res = query(1, 0, n - 1, start, n - 1);

            ans[i] = res.count[x];
        }

        return ans;
    }
}