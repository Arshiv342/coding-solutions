import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        // Count frequency of each factor
        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        // Calculate free items for each factor
        int[] gain = new int[maxFactor + 1];

        for (int f = 1; f <= maxFactor; f++) {
            int count = 0;

            for (int j = f; j <= maxFactor; j += f) {
                count += freq[j];
            }

            gain[f] = count - 1;
        }

        // Store profitable item types
        List<int[]> candidates = new ArrayList<>();

        for (int[] item : items) {
            int f = item[0];
            int price = item[1];

            if (gain[f] > 0 && price <= 2L * minPrice) {
                candidates.add(new int[]{price, gain[f]});
            }
        }

        // Sort by price
        candidates.sort((a, b) ->
            Integer.compare(a[0], b[0])
        );

        long ans = 0;
        long remaining = budget;

        // Buy items that give one free item
        for (int[] item : candidates) {
            int price = item[0];
            int count = item[1];

            long buy = Math.min(count, remaining / price);

            ans += buy * 2;
            remaining -= buy * price;
        }

        // Buy cheapest normal items
        ans += remaining / minPrice;

        return (int) ans;
    }
}