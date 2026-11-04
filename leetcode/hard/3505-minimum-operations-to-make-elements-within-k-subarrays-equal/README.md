# Minimum Operations to Make Elements Within K Subarrays Equal

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums` and two integers, `x` and `k`. You can perform the following operation any number of times (**including zero**):

- Increase or decrease any element of nums by 1.

Return the  **minimum**  number of operations needed to have  **at least**  `k`  *non-overlapping subarrays*  of size  **exactly**  `x` in `nums`, where all elements within each subarray are equal.

 

 **Example 1:** 

 **Input:**  nums = [5,-2,1,3,7,3,6,4,-1], x = 3, k = 2

 **Output:**  8

 **Explanation:** 

- Use 3 operations to add 3 to nums[1] and use 2 operations to subtract 2 from nums[3]. The resulting array is [5, 1, 1, 1, 7, 3, 6, 4, -1].
- Use 1 operation to add 1 to nums[5] and use 2 operations to subtract 2 from nums[6]. The resulting array is [5, 1, 1, 1, 7, 4, 4, 4, -1].
- Now, all elements within each subarray [1, 1, 1] (from indices 1 to 3) and [4, 4, 4] (from indices 5 to 7) are equal. Since 8 total operations were used, 8 is the output.

 **Example 2:** 

 **Input:**  nums = [9,-2,-2,-2,1,5], x = 2, k = 2

 **Output:**  3

 **Explanation:** 

- Use 3 operations to subtract 3 from nums[4]. The resulting array is [9, -2, -2, -2, -2, 5].
- Now, all elements within each subarray [-2, -2] (from indices 1 to 2) and [-2, -2] (from indices 3 to 4) are equal. Since 3 operations were used, 3 is the output.

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -106 <= nums[i] <= 106
- 2 <= x <= nums.length
- 1 <= k <= 15
- 2 <= k * x <= nums.length

## Solution

**Language:** Java  
**Runtime:** 985 ms (beats 18.42%)  
**Memory:** 131.1 MB (beats 89.47%)  
**Submitted:** 2026-11-04T02:28:17.811Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-make-elements-within-k-subarrays-equal/)