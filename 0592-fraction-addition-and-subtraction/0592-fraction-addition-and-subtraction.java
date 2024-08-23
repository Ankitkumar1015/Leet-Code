import java.util.*;

public class Solution {

    public String fractionAddition(String expression) {
        int numerator = 0, denominator = 1;
        int i = 0, n = expression.length();

        while (i < n) {
            // Parse the sign
            int sign = 1;
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                sign = expression.charAt(i) == '-' ? -1 : 1;
                i++;
            }

            // Parse the numerator
            int num = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) {
                num = num * 10 + (expression.charAt(i) - '0');
                i++;
            }

            // Move past the '/'
            i++;

            // Parse the denominator
            int denom = 0;
            while (i < n && Character.isDigit(expression.charAt(i))) {
                denom = denom * 10 + (expression.charAt(i) - '0');
                i++;
            }

            // Update the current numerator and denominator
            numerator = numerator * denom + sign * num * denominator;
            denominator = denominator * denom;

            // Reduce the fraction by dividing by the GCD
            int gcd = gcd(Math.abs(numerator), denominator);
            numerator /= gcd;
            denominator /= gcd;
        }

        return numerator + "/" + denominator;
    }

    // Helper method to calculate the GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fractionAddition("1/3-1/2")); // Output: -1/6
        System.out.println(solution.fractionAddition("-1/2+1/2+1/3")); // Output: 1/3
    }
}
