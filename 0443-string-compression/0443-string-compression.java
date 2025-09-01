class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;  // position to write result
        int i = 0;      // read pointer

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            // count consecutive chars
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write char
            chars[write++] = currentChar;

            // write count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // new length of compressed array
    }
}
