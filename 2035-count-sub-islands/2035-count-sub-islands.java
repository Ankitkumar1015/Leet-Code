class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int subIslands = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    if (dfs(grid1, grid2, i, j)) {
                        subIslands++;
                    }
                }
            }
        }
        
        return subIslands;
    }
    
    private boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || i >= grid1.length || j < 0 || j >= grid1[0].length || grid2[i][j] == 0) {
            return true;
        }
        
        if (grid1[i][j] == 0) {
            return false;
        }
        
        grid2[i][j] = 0; // Mark as visited
        
        boolean isSubIsland = true;
        isSubIsland &= dfs(grid1, grid2, i-1, j); // Up
        isSubIsland &= dfs(grid1, grid2, i+1, j); // Down
        isSubIsland &= dfs(grid1, grid2, i, j-1); // Left
        isSubIsland &= dfs(grid1, grid2, i, j+1); // Right
        
        return isSubIsland;
    }
}