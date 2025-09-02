class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int i = 0;
        int j = 1;
        int n = s.length();
        int balance = 1; // since we start with '(' at i=0

        while (j < n) {
            if (s.charAt(j) == '(') {
                balance++;
                if (balance > 1) ans += s.charAt(j); // not outermost
            } else { // s.charAt(j) == ')'
                balance--;
                if (balance > 0) ans += s.charAt(j); // not outermost
            }
            j++;
        }
        return ans;
    }
}
