import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    long[][] comb;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i-1][j-1] + comb[i-1][j]) % MOD;
            }
        }
        return (int)((dfs(nums) - 1 + MOD) % MOD);
    }

    private long dfs(int[] arr) {
        if (arr.length <= 2) return 1;
        int root = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int x : arr) {
            if (x < root) left.add(x);
            else if (x > root) right.add(x);
        }
        int L = left.size(), R = right.size();
        long leftWays = dfs(left.stream().mapToInt(i->i).toArray());
        long rightWays = dfs(right.stream().mapToInt(i->i).toArray());
        return comb[L+R][L] * leftWays % MOD * rightWays % MOD;
    }
}
