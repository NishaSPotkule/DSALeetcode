class Solution {
    public int minPathSum(int[][] grid) {
         int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return minPath(grid,0,0,dp);
        
        
    }
    public int minPath(int[][]grid,int i,int j,int[][]dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1){
            return grid[i][j]+(minPath(grid,i,j+1,dp));
        }
        if(j==n-1){
            return grid[i][j]+(minPath(grid,i+1,j,dp));
        }
        int right=grid[i][j]+(minPath(grid,i,j+1,dp));
        int down=grid[i][j]+(minPath(grid,i+1,j,dp));
        return dp[i][j]=Math.min(right,down);
    }
}