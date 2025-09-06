class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapST = new int[256];  // map from s → t
        int[] mapTS = new int[256];  // map from t → s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                // establish mapping
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else {
                // check consistency
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            }
        }
        return true;
    }
}
