# Palindromic Path Queries in a Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an undirected tree with `n` nodes labeled 0 to `n - 1`. This is represented by a 2D array `edges` of length `n - 1`, where `edges[i] = [ui, vi]` indicates an undirected edge between nodes `ui` and `vi`.

You are also given a string `s` of length `n` consisting of lowercase English letters, where `s[i]` represents the character assigned to node `i`.

You are also given a string array `queries`, where each `queries[i]` is either:

- "update ui c": Change the character at node ui to c. Formally, update s[ui] = c.
- "query ui vi": Determine whether the string formed by the characters on the unique path from ui to vi (inclusive) can be rearranged into a palindrome.

Return a boolean array `answer`, where `answer[j]` is `true` if the `jth` query of type `"query ui vi"​​​​​​​` can be rearranged into a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  n = 3, edges = [[0,1],[1,2]], s = "aac", queries = ["query 0 2","update 1 b","query 0 2"]

 **Output:**  [true,false]

 **Explanation:** 

- "query 0 2": Path 0 → 1 → 2 gives "aac", which can be rearranged to form "aca", a palindrome. Thus, answer[0] = true.
- "update 1 b": Update node 1 to 'b', now s = "abc".
- "query 0 2": Path characters are "abc", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.

Thus, `answer = [true, false]`.

 **Example 2:** 

 **Input:**  n = 4, edges = [[0,1],[0,2],[0,3]], s = "abca", queries = ["query 1 2","update 0 b","query 2 3","update 3 a","query 1 3"]

 **Output:**  [false,false,true]

 **Explanation:** 

- "query 1 2": Path 1 → 0 → 2 gives "bac", which cannot be rearranged to form a palindrome. Thus, answer[0] = false.
- "update 0 b": Update node 0 to 'b', now s = "bbca".
- "query 2 3": Path 2 → 0 → 3 gives "cba", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.
- "update 3 a": Update node 3 to 'a', s = "bbca".
- "query 1 3": Path 1 → 0 → 3 gives "bba", which can be rearranged to form "bab", a palindrome. Thus, answer[2] = true.

Thus, `answer = [false, false, true]`.

 

 **Constraints:** 

- 1 <= n == s.length <= 5 * 104
- edges.length == n - 1
- edges[i] = [ui, vi]
- 0 <= ui, vi <= n - 1
- s consists of lowercase English letters.
- The input is generated such that edges represents a valid tree.
- 1 <= queries.length <= 5 * 104​​​​​​​queries[i] = "update ui c" or queries[i] = "query ui vi" 0 <= ui, vi <= n - 1 c is a lowercase English letter.

## Solution

**Language:** Java  
**Runtime:** 110 ms (beats 100.00%)  
**Memory:** 221.6 MB (beats 57.14%)  
**Submitted:** 2026-10-29T13:39:41.660Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/palindromic-path-queries-in-a-tree/)