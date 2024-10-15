import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        
        // Convert the List back to an array
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = targetList.get(i);
        }
        
        return target;
    }
}
