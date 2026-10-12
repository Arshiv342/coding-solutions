class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final int MOD = 1_000_000_007;
        final int MAX_BIT = 30;
        int[] minIndices = new int[MAX_BIT];
        int[] optimalNums = new int[nums.size()];

        for (int num : nums) {
            for (int i = 0; i < MAX_BIT; i++) {
                if ((num >> i & 1) == 1) {
                    optimalNums[minIndices[i]] |= 1 << i;
                    minIndices[i]++;
                }
            }
        }

        Arrays.sort(optimalNums);
        int ans = 0;
        for (int i = optimalNums.length - 1; i >= optimalNums.length - k; i--) {
            ans = (int)((ans + (long)optimalNums[i] * optimalNums[i]) % MOD);
        }
        return ans;
    }
}
