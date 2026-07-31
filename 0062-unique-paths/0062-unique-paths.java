class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        for(int[]i:dp){
            Arrays.fill(i,-1);
        }
        return unique(m,n,0,0,dp);

        
    }
    int unique(int m,int n,int i,int j,int[][]dp){
        if(i==m-1 && j==n-1){
            return 1;

        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1){
            return unique(m,n,i,j+1,dp);
        }
        if(j==n-1){
            return unique(m,n,i+1,j,dp);
        }
    
       return dp[i][j]=unique(m,n,i,j+1,dp)+unique(m,n,i+1,j,dp);

    }
}