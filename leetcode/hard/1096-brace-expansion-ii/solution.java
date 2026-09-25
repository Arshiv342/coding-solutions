class Solution {
    public List<String> braceExpansionII(String expression) {
        return dfs(expression, 0, expression.length() - 1);
    }

    private List<String> dfs(String expr, int s, int e) {
        TreeSet<String> ans = new TreeSet<>();
        List<List<String>> groups = new ArrayList<>();
        groups.add(new ArrayList<>());
        int layer = 0, left = 0;

        for (int i = s; i <= e; i++) {
            char c = expr.charAt(i);
            if (c == '{' && ++layer == 1) {
                left = i + 1;
            } else if (c == '}' && --layer == 0) {
                merge(groups, dfs(expr, left, i - 1));
            } else if (c == ',' && layer == 0) {
                groups.add(new ArrayList<>());
            } else if (layer == 0) {
                merge(groups, new ArrayList<>(List.of(String.valueOf(c))));
            }
        }

        for (List<String> group : groups) {
            for (String word : group) ans.add(word);
        }
        return new ArrayList<>(ans);
    }

    private void merge(List<List<String>> groups, List<String> group) {
        if (groups.get(groups.size() - 1).isEmpty()) {
            groups.set(groups.size() - 1, group);
            return;
        }
        List<String> merged = new ArrayList<>();
        for (String w1 : groups.get(groups.size() - 1)) {
            for (String w2 : group) {
                merged.add(w1 + w2);
            }
        }
        groups.set(groups.size() - 1, merged);
    }
}
