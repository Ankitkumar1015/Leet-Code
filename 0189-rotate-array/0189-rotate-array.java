class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Step 1: Reverse whole array
        rev(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        rev(nums, 0, k - 1);
        // Step 3: Reverse last n-k elements
        rev(nums, k, n - 1);
    }

    public void rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
