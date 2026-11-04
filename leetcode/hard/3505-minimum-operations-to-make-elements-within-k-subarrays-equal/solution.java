import java.util.*;

class Solution {

    class MultiSet {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int size = 0;
        long sum = 0;

        void add(int val) {
            map.put(val, map.getOrDefault(val, 0) + 1);
            size++;
            sum += val;
        }

        void remove(int val) {
            int count = map.get(val);

            if (count == 1)
                map.remove(val);
            else
                map.put(val, count - 1);

            size--;
            sum -= val;
        }

        int first() {
            return map.firstKey();
        }

        int last() {
            return map.lastKey();
        }
    }

    MultiSet lower = new MultiSet();
    MultiSet upper = new MultiSet();

    void rebalance() {
        while (lower.size < upper.size) {
            int val = upper.first();
            upper.remove(val);
            lower.add(val);
        }

        while (lower.size > upper.size + 1) {
            int val = lower.last();
            lower.remove(val);
            upper.add(val);
        }
    }

    void add(int val) {
        if (lower.size == 0 || val <= lower.last())
            lower.add(val);
        else
            upper.add(val);

        rebalance();
    }

    void remove(int val) {
        if (lower.map.containsKey(val))
            lower.remove(val);
        else
            upper.remove(val);

        rebalance();
    }

    long getCost() {
        long median = lower.last();

        return median * lower.size - lower.sum
             + upper.sum - median * upper.size;
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        long[] cost = new long[n - x + 1];

        
        for (int i = 0; i < n; i++) {

            add(nums[i]);

            if (i >= x)
                remove(nums[i - x]);

            if (i >= x - 1)
                cost[i - x + 1] = getCost();
        }

        
        long INF = Long.MAX_VALUE / 2;

        long[] prev = new long[n + 1];
        long[] curr = new long[n + 1];

        for (int t = 1; t <= k; t++) {

            Arrays.fill(curr, INF);

            for (int i = 1; i <= n; i++) {

                
                curr[i] = curr[i - 1];

                
                if (i >= x && prev[i - x] != INF) {

                    curr[i] = Math.min(
                        curr[i],
                        prev[i - x] + cost[i - x]
                    );
                }
            }

            long[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}