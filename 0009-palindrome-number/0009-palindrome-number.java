class Solution {
    public boolean isPalindrome(int x) {
        String s =x +"";
        boolean check = true;
        int i = 0 ;
        int j = s.length ()-1 ;
        while (i< j ){
            if (s.charAt(i)!= s.charAt(j)){
                    check = false ;
                    break;
            }
            i ++;
            j --;
        }
        return check ;
    
    }
}