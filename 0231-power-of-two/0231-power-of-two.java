class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans=true;
        if(n<= 0){
            ans = false;

        }
        else{
        ans = (n&(n-1))==0;
        }
        return ans ;
        
    }
}