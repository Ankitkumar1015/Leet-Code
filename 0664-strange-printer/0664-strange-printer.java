public class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        int[][] dp = new int[n][n];
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = len == 1 ? 1 : dp[i][j - 1] + 1;
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + (k + 1 <= j - 1 ? dp[k + 1][j - 1] : 0));
                    }
                }
            }
        }
        
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Solution printer = new Solution();
        String s = "abcba";
        System.out.println(printer.strangePrinter(s));  // Output: 5
    }
}
