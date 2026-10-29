
import java.util.*;

class Solution {
    private List<Integer>[] graph;
    private int[][] up;
    private int[] depth, tin, tout, parent;
    private int[] prefix;
    private int[] bit;
    private int[] iter;
    private int timer, LOG, n;

    private int mask(char c) {
        return 1 << (c - 'a');
    }

    private void add(int i, int value) {
        while (i <= n) {
            bit[i] ^= value;
            i += i & -i;
        }
    }

    private int sum(int i) {
        int result = 0;
        while (i > 0) {
            result ^= bit[i];
            i -= i & -i;
        }
        return result;
    }

    private int getPrefix(int node) {
        return prefix[node] ^ sum(tin[node]);
    }

    private void dfs() {
        int[] stack = new int[n];
        int top = 0;

        stack[0] = 0;
        parent[0] = 0;
        tin[0] = ++timer;
        prefix[0] = mask('a'); // Replaced below with actual root prefix.

        while (top >= 0) {
            int u = stack[top];

            if (iter[u] < graph[u].size()) {
                int v = graph[u].get(iter[u]++);

                if (v == parent[u]) {
                    continue;
                }

                parent[v] = u;
                depth[v] = depth[u] + 1;
                up[0][v] = u;

                tin[v] = ++timer;
                stack[++top] = v;
            } else {
                tout[u] = timer;
                top--;
            }
        }
    }

    private int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int k = 0; k < LOG; k++) {
            if (((diff >> k) & 1) != 0) {
                u = up[k][u];
            }
        }

        if (u == v) {
            return u;
        }

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][u] != up[k][v]) {
                u = up[k][u];
                v = up[k][v];
            }
        }

        return up[0][u];
    }

    public List<Boolean> palindromePath(
            int n, int[][] edges, String s, String[] queries) {

        this.n = n;
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        up = new int[LOG][n];
        depth = new int[n];
        tin = new int[n];
        tout = new int[n];
        parent = new int[n];
        prefix = new int[n];
        iter = new int[n];
        bit = new int[n + 2];

        // Iterative DFS: calculate Euler positions and parents.
        int[] stack = new int[n];
        int top = 0;
        stack[0] = 0;
        parent[0] = 0;
        tin[0] = ++timer;
        prefix[0] = mask(s.charAt(0));

        while (top >= 0) {
            int u = stack[top];

            if (iter[u] < graph[u].size()) {
                int v = graph[u].get(iter[u]++);

                if (v == parent[u]) {
                    continue;
                }

                parent[v] = u;
                depth[v] = depth[u] + 1;
                up[0][v] = u;
                prefix[v] = prefix[u] ^ mask(s.charAt(v));

                tin[v] = ++timer;
                stack[++top] = v;
            } else {
                tout[u] = timer;
                top--;
            }
        }

        for (int k = 1; k < LOG; k++) {
            for (int v = 0; v < n; v++) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }

        char[] chars = s.toCharArray();
        List<Boolean> answer = new ArrayList<>();

        for (String q : queries) {
            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {
                int u = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);

                int delta = mask(chars[u]) ^ mask(c);

                add(tin[u], delta);
                if (tout[u] < n) {
                    add(tout[u] + 1, delta);
                }

                chars[u] = c;
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);

                int ancestor = lca(u, v);

                int pathMask = getPrefix(u)
                             ^ getPrefix(v)
                             ^ mask(chars[ancestor]);

                answer.add((pathMask & (pathMask - 1)) == 0);
            }
        }

        return answer;
    }
}
