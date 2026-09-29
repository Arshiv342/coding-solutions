class Solution {
    int m, n;
    char[][] grid;
    Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        this.memo = new Boolean[m][n][m+n+1];

        if ((m+n-1) % 2 != 0) return false;
        if (grid[0][0] == ')' || grid[m-1][n-1] == '(') return false;

        return dfs(0, 0, 0);
    }

    private boolean dfs(int i, int j, int k) {
        k += (grid[i][j] == '(' ? 1 : -1);
        if (k < 0 || k > (m+n-i-j-1)) return false;
        if (i == m-1 && j == n-1) return k == 0;
        if (memo[i][j][k] != null) return memo[i][j][k];

        boolean res = false;
        if (i+1 < m) res |= dfs(i+1, j, k);
        if (j+1 < n) res |= dfs(i, j+1, k);

        return memo[i][j][k] = res;
    }
}
