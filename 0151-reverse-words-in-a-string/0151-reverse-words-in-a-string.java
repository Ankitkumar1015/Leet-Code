class Solution {
    public String reverseWords(String s) {
        // Step 1: trim leading/trailing spaces
        s = s.trim();

        // Step 2: split by one or more spaces (regex: "\\s+")
        String[] words = s.split("\\s+");

        // Step 3: reverse and join
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i > 0) ans.append(" "); // avoid trailing space
        }

        return ans.toString();
    }
}
