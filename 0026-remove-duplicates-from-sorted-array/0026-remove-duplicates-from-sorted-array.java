import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // position for placing the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
                // j++;
            }
        }

        return j+1; // number of unique elements
    }
}
