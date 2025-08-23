class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0 ; i < n ; i++){
            for( int j = i+ 1; j < n ;j++){
                sum = nums[i]+nums[j];

                if(sum == target){
                    return new  int[]{i,j} ;
                }
                sum = 0 ;
            }
        }
        return new int[]{};
        
    }
}