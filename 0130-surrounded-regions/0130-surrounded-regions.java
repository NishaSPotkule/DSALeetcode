class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        Queue<Pair>q=new LinkedList<>();
        int[][]vis=new int[m][n];
        for(int[] i:vis){
            Arrays.fill(i,-1);
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O'){
                q.add(new Pair(0,j));
                vis[0][j]=1;
            }
        }
        for(int i=1;i<m;i++){
            if(board[i][0]=='O'){
                q.offer(new Pair(i,0));
                vis[i][0]=1;
            }
        }
        for(int i=1;i<m;i++){
            if(board[i][n-1]=='O'){
                q.offer(new Pair(i,n-1));
                vis[i][n-1]=1;
            }
        }
        for(int j=1;j<n-1;j++){
            if(board[m-1][j]=='O'){
                q.offer(new Pair(m-1,j));
                vis[m-1][j]=1;
            }
        }
        
        while(!q.isEmpty()){
            Pair p=q.poll();
            int i=p.row;
            int j=p.col;

            if(j-1>0 && board[i][j-1]=='O' && vis[i][j-1]==-1){
                q.offer(new Pair(i,j-1));
                vis[i][j-1]=1;
            }
             if(i-1>0 && board[i-1][j]=='O' && vis[i-1][j]==-1){
                q.offer(new Pair(i-1,j));
                vis[i-1][j]=1;
            }
             if(j+1<n && board[i][j+1]=='O' && vis[i][j+1]==-1){
                q.offer(new Pair(i,j+1));
                vis[i][j+1]=1;
            }
             if(i+1<m && board[i+1][j]=='O' && vis[i+1][j]==-1){
                q.offer(new Pair(i+1,j));
                vis[i+1][j]=1;
            }


        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && vis[i][j]==-1){
                    board[i][j]='X';
                }
            }
        }



        
    }
}