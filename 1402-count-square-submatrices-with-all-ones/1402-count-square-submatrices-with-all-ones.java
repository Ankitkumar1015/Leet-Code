class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0 && i > 0 && j > 0) {
                    matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(matrix[i][j - 1], matrix[i - 1][j - 1]));
                }
                count += matrix[i][j];
            }
        }
        return count;
    }
}

