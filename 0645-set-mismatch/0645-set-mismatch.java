class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        
        Arrays.sort(nums);  // sort the array
        
        for (int i = 0; i < n - 1; i++) {
            // If two adjacent are equal → duplicate
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i]; // duplicate number
            }
        }

        // Now find the missing by checking expected sum
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int x : nums) actualSum += x;

        ans[1] = expectedSum - (actualSum - ans[0]);  // missing number
        
        return ans;
    }
}
