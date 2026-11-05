import java.util.*;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;

        for (int x : arr1) {
            int idx = Arrays.binarySearch(arr2, x);

            if (idx < 0) {
                idx = -idx - 1;
            }

            boolean valid = true;

            if (idx < arr2.length && Math.abs(arr2[idx] - x) <= d) {
                valid = false;
            }

            if (idx > 0 && Math.abs(arr2[idx - 1] - x) <= d) {
                valid = false;
            }

            if (valid) {
                ans++;
            }
        }

        return ans;
    }
}