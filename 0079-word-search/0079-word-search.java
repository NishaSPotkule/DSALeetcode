class Solution {

    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        char ch=word.charAt(0);
        int idx=0;
        int[][]vis=new int[m][n];
        for(int[]num:vis){
            Arrays.fill(num,-1);

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==ch){
                if(dfs(word,0,i,j,board,vis)){
                    return true;
                }
                }
                
            }
        }
        return false;


        
    }
    boolean dfs(String word,int idx,int i,int j,char[][]board,int[][]vis){
        int m=board.length;
        int n=board[0].length;
        
        if(idx==word.length()-1){
            return true;
        }
        vis[i][j]=1; 
        boolean found=false;
        if(!found&&i-1>=0 && board[i-1][j]==word.charAt(idx+1) && vis[i-1][j]==-1){
            found= dfs(word,idx+1,i-1,j,board,vis);
        }
         if(!found&&i+1<m && board[i+1][j]==word.charAt(idx+1) && vis[i+1][j]==-1){
            found= dfs(word,idx+1,i+1,j,board,vis);
        }
         if(!found&&j-1>=0 && board[i][j-1]==word.charAt(idx+1) && vis[i][j-1]==-1){
            found= dfs(word,idx+1,i,j-1,board,vis);
        }
         if(!found&&j+1<n && board[i][j+1]==word.charAt(idx+1) && vis[i][j+1]==-1){
            found= dfs(word,idx+1,i,j+1,board,vis);
        }
        vis[i][j]=-1;
        return found;
        

    }
}