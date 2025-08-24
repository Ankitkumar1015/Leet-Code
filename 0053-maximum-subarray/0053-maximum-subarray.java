class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];  // running sum of subarray
        int maxSum = nums[0];      // best (maximum) sum seen so far

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray OR start new subarray at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is better
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
