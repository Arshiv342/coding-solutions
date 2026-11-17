
import java.util.*;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                cost[i][j] = len;

                for (int d = 1; d < len; d++) {
                    if (len % d != 0) {
                        continue;
                    }

                    int changes = 0;

                    for (int x = 0; x < d; x++) {
                        int left = i + x;
                        int right = j - d + 1 + x;

                        while (left < right) {
                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }

                            left += d;
                            right -= d;
                        }
                    }

                    cost[i][j] = Math.min(cost[i][j], changes);
                }
            }
        }

        int[][] dp = new int[n + 1][k + 1];

        for (int[] row : dp) {
            Arrays.fill(row, 100000);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int parts = 1; parts <= k; parts++) {
                for (int j = 0; j < i - 1; j++) {
                    dp[i][parts] = Math.min(
                        dp[i][parts],
                        dp[j][parts - 1] + cost[j][i - 1]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
