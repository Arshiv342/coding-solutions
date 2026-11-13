
import java.util.*;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;

        Deque<int[]> dq = new ArrayDeque<>();

        long cost = 0;
        long ans = 0;

        int j = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            int count = 1;

            while (!dq.isEmpty() && dq.peekLast()[0] < nums[i]) {
                int[] last = dq.pollLast();

                count += last[1];

                cost += (long) (nums[i] - last[0]) * last[1];
            }

            dq.offerLast(new int[]{nums[i], count});

            while (cost > k) {
                int[] first = dq.pollFirst();

                cost -= (long) (first[0] - nums[j]);

                if (first[1] > 1) {
                    dq.offerFirst(new int[]{first[0], first[1] - 1});
                }

                j--;
            }

            ans += j - i + 1;
        }

        return ans;
    }
}
