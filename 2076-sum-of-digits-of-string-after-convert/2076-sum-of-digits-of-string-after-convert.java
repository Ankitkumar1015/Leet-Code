import java.math.BigInteger;

public class Solution {
    
    public int getLucky(String s, int k) {
        // Step 1: Convert string to BigInteger based on alphabetical positions
        BigInteger num = convertStringToInt(s);
        
        // Step 2: Perform the transformation k times
        for (int i = 0; i < k; i++) {
            num = sumOfDigits(num);
        }
        
        return num.intValue(); // Convert back to int for final result
    }

    private BigInteger convertStringToInt(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int position = c - 'a' + 1; // Calculate position (1-26)
            sb.append(position); // Append to the string
        }
        return new BigInteger(sb.toString()); // Convert to BigInteger
    }

    private BigInteger sumOfDigits(BigInteger n) {
        BigInteger sum = BigInteger.ZERO;
        while (n.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(n.mod(BigInteger.TEN)); // Add last digit
            n = n.divide(BigInteger.TEN); // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String param_1 = "zbax"; // Example input string
        int param_2 = 2; // Example k value
        int result = solution.getLucky(param_1, param_2);
        System.out.println(result); // Output: 8
    }
}
