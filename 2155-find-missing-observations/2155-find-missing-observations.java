import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;

        // Total sum of all n + m rolls
        int totalSum = mean * (n + m);

        // Sum of the given m rolls
        int knownSum = 0;
        for (int roll : rolls) {
            knownSum += roll;
        }

        // Sum of the missing n rolls
        int missingSum = totalSum - knownSum;

        // Check if the missingSum can be split into n numbers between 1 and 6
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];  // Return an empty array if no solution exists
        }

        // Initialize the result array with n ones
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        // Reduce the missingSum by the amount already added in result (since each is initialized with 1)
        missingSum -= n;

        // Distribute the remaining missingSum across the n rolls
        int i = 0;
        while (missingSum > 0) {
            int add = Math.min(5, missingSum);  // We can add up to 5 more (since 1 is already added)
            result[i] += add;
            missingSum -= add;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] rolls = {3, 2, 4, 3};
        int mean = 4;
        int n = 2;

        int[] missing = solution.missingRolls(rolls, mean, n);
        for (int num : missing) {
            System.out.print(num + " ");
        }
        // Example output: 6 6
    }
}
