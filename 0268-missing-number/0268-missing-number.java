class Solution {
    public int missingNumber(int[] nums) {
        int k = 0;
        for (int i = 0 ; i< nums.length -1;i++){
            for (int j = 0 ; j < nums.length-i-1;j++){
                if (nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                }

            }
        }
        for(int i =0; i<nums.length;i++){
            if( i != nums[i]){
                return i;
                // break;
                
            }
           
            
        }
        // return k ;
        return nums.length;
    }
}