class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        int count = 0 ;
        int n = nums.length; 
        for(int i = 0 ; i<n ; i++){
            // count = 0 ;
            if (nums[i] == 1){
                count +=1;

            }
            else{
                max= Math.max(count , max );
                count = 0;
            }

        }
        max= Math.max(count , max );
        
        return max;
    }
    
}