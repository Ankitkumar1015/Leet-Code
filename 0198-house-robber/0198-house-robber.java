class Solution {
    public int rob(int[] nums) {
        if ( nums.length == 1){
            return nums[0];
        }

        int[] res = new int [ nums.length ];

        res[0]= nums [ 0];
        res[1]= Math.max( nums[0], nums[1]);

        for( int i = 2 ; i< nums.length ; i++){

            res[i]= Math.max( res[i-2]+ nums[i], res[i-1]);
        }
        return res[nums.length - 1];
    }
}