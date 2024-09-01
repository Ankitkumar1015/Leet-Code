class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
    // Step 1: Check if the total number of elements matches m * n
    if (original.length != m * n) {
        return new int[0][0];  // Return an empty 2D array if the dimensions are incompatible
    }
    
    // Step 2: Create the 2D array
    int[][] result = new int[m][n];
    int k = 0;  // Index for iterating through the 1D array
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            result[i][j] = original[k++];
        }
    }
    
    // Step 3: Return the constructed 2D array
    return result;
}
}