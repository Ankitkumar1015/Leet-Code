class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int sum = 0;
        
        // Apply the increments based on the indices using traditional for loops
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            
            // Increment all cells in the row
            for (int j = 0; j < n; j++) {
                res[row][j]++;
            }
            
            // Increment all cells in the column
            for (int j = 0; j < m; j++) {
                res[j][col]++;
            }
        }
        
        // Calculate the sum of odd values using traditional for loops
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] % 2 != 0 ) {
                    sum ++;
                }
            }
        }
        
        return sum;  // Return the sum of odd values
    }
}
