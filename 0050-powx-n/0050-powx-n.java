class Solution {
    public double myPow(double x, int n) {
        if (n>0){
            return power(x,(long)n);
        }
        else{
            return 1/power(x,-(long)n);
        }
        
        
        
    }
    public double  power(double x , long n ){
        double ans = 1 ;
        while (n> 0){
        if ((n & 1 )==1){
            ans = ans *x;
        }

        x = x *x ;
        n = n>>1;
        }
       return ans ;
    }
     

    
}