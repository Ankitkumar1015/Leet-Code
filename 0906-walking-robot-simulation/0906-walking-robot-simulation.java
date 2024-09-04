import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int robotSim(int[] commands, int[][] obstacles) {
        // Directions: North, East, South, West
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;  // Start facing North

        // Convert the obstacle array into a set of strings for quick lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        // Starting position
        int x = 0, y = 0;
        int maxDistanceSq = 0;

        // Process each command
        for (int command : commands) {
            if (command == -2) {  // Turn left
                directionIndex = (directionIndex + 3) % 4;  // Equivalent to -1 mod 4
            } else if (command == -1) {  // Turn right
                directionIndex = (directionIndex + 1) % 4;
            } else {  // Move forward
                for (int i = 0; i < command; i++) {
                    // Calculate the next position
                    int nextX = x + directions[directionIndex][0];
                    int nextY = y + directions[directionIndex][1];

                    // Check if the next position is an obstacle
                    if (obstacleSet.contains(nextX + "," + nextY)) {
                        break;  // Stop moving if the next step hits an obstacle
                    }

                    // Update the position
                    x = nextX;
                    y = nextY;

                    // Update the maximum Euclidean distance squared
                    maxDistanceSq = Math.max(maxDistanceSq, x * x + y * y);
                }
            }
        }

        return maxDistanceSq;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] commands1 = {4, -1, 3};
        int[][] obstacles1 = {};
        System.out.println(solution.robotSim(commands1, obstacles1));  // Output: 25

        // Example 2
        int[] commands2 = {4, -1, 4, -2, 4};
        int[][] obstacles2 = {{2, 4}};
        System.out.println(solution.robotSim(commands2, obstacles2));  // Output: 65
    }
}
