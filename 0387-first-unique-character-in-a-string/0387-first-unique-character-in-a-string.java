class Solution {
    public int firstUniqChar(String s) {
         
        int ans = -1 ;
        for ( int i = 0 ; i<s.length () ; i++ ){
            int count = 0;
            for ( int j = 0; j< s.length () ; j++ ){
                if (i !=j && s.charAt(i)==s.charAt(j)){
                    count ++;
                    break;

                }
            }
            if ( count == 0 ){
                return i;

            }
            
        }
        return -1 ;
    }
}