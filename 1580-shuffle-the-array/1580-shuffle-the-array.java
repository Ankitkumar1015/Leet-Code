class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] outs= new int [nums.length];
        n= nums.length/2;
        int start =0;
        int end = n;
        for (int i =0 ; i<nums.length;i+=2){
            outs[i]=nums[start];
            outs[i+1]=nums[end];
            start++;
            end++;
        }
        return outs;

    }
}