class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Determine the range for binary search: 
        // start is the maximum element and end is the sum of all elements
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // Binary search for the minimum largest sum
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int p = 1; // Number of subarrays, start with 1

            for (int num : nums) {
                if (sum + num > mid) {
                    // If adding num exceeds mid, we create a new subarray
                    sum = num;
                    p++;
                } else {
                    sum += num;
                }
            }

            // Check if the number of subarrays is more than allowed (k)
            if (p > k) {
                start = mid + 1; // Increase the range (mid is too small)
            } else {
                end = mid; // Try to find a smaller valid mid
            }
        }

        return start; // Start will be the minimum largest sum
    }
}
