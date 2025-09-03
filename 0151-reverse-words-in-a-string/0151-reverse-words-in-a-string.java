class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = n - 1;

        while (i >= 0) {
            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int j = i;
            // find start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;

            // append word
            ans.append(s.substring(i + 1, j + 1));
            ans.append(" ");
        }

        // remove trailing space
        return ans.toString().trim();
    }
}
