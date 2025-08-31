class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // check if uppercase letter (A–Z)
            if (ch >= 65 && ch <= 90) {
                sb.setCharAt(i, (char)(ch + 32)); // convert uppercase to lowercase
            }
        }

        return sb.toString(); 
    }
}
