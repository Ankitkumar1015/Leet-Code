class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cc=0,mxc=0;
        for(int i =0 ; i<nums.length ; i++){
            if (nums[i]==1){
                cc++;
            
            }
            else{
                Math.max(mxc,cc);
                    cc=0;
                    
                }
                mxc=Math.max(cc,mxc);
            
        }
        return mxc;
    }
}