
import java.util.*;

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        // Build original tree
        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        // Find new parent of every node
        int[] newParent = parent.clone();
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        int[] previous = new int[n];
        int[] stack = new int[2 * n];
        int top = 0;

        stack[top++] = 0;

        while (top > 0) {
            int node = stack[--top];

            if (node >= 0) {
                int ch = s.charAt(node) - 'a';

                previous[node] = lastSeen[ch];

                if (lastSeen[ch] != -1) {
                    newParent[node] = lastSeen[ch];
                }

                lastSeen[ch] = node;

                // Exit marker
                stack[top++] = ~node;

                // Visit children
                for (int child : tree[node]) {
                    stack[top++] = child;
                }
            } else {
                node = ~node;

                int ch = s.charAt(node) - 'a';
                lastSeen[ch] = previous[node];
            }
        }

        // Build modified tree
        List<Integer>[] newTree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            newTree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            newTree[newParent[i]].add(i);
        }

        // Calculate subtree sizes
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        int[] order = new int[n];
        top = 0;
        int count = 0;

        stack[top++] = 0;

        while (top > 0) {
            int node = stack[--top];
            order[count++] = node;

            for (int child : newTree[node]) {
                stack[top++] = child;
            }
        }

        // Reverse order: children before parents
        for (int i = n - 1; i > 0; i--) {
            int node = order[i];
            ans[newParent[node]] += ans[node];
        }

        return ans;
    }
}
