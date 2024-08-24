import java.util.*;

public class Solution {
    
    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);
        
        // Handle small numbers edge cases
        if (num <= 10) return Long.toString(num - 1);
        if (num == 11) return "9";

        // Generate the candidate palindromes
        List<Long> candidates = new ArrayList<>();
        
        // Edge case palindromes
        candidates.add((long) Math.pow(10, len - 1) - 1);  // Smallest palindrome with one fewer digit
        candidates.add((long) Math.pow(10, len) + 1);      // Smallest palindrome with one more digit
        
        // Get the prefix of the original number
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        
        // Build candidates by mirroring the prefix
        for (long i = prefix - 1; i <= prefix + 1; i++) {
            String left = Long.toString(i);
            String right = new StringBuilder(left).reverse().substring(len % 2);
            candidates.add(Long.parseLong(left + right));
        }
        
        // Find the closest palindrome
        long closest = -1;
        for (long candidate : candidates) {
            if (candidate != num) {
                if (closest == -1 || Math.abs(candidate - num) < Math.abs(closest - num) || 
                    (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
                    closest = candidate;
                }
            }
        }
        
        return Long.toString(closest);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nearestPalindromic("123"));  // Output: 121
        System.out.println(solution.nearestPalindromic("1"));    // Output: 0
    }
}
