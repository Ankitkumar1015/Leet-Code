class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int m = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' ) {
              if( m>i){
                    for (int j = i + 1; j <= m; j++) {
                    ans.append(s.charAt(j));
                }
                ans.append(" ");
              }
                m = i - 1; // update word boundary
            }
        }

        // Add the very first word
        for (int j = 0; j <= m; j++) {
            ans.append(s.charAt(j));
        }

        return ans.toString().trim();
    }
}
