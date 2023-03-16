package Graphs.Traversal.Medium;

public class SurroundedRegions {

//    https://leetcode.com/problems/surrounded-regions/
    public void solve(char[][] board) {


        int n = board.length;
        int m = board[0].length;

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        boolean[][] vis = new boolean[n][m];

        for(int i =0; i<m ; i++){
            if(board[0][i] == 'O'){
                dfs(board, vis, drow, dcol, 0, i);
            }

        }
        for(int i =0; i<n ; i++){
            if(board[i][0] == 'O'){
                dfs(board, vis, drow, dcol, i, 0);
            }

        }
        for(int i =0; i<m ; i++){
            if(board[n-1][i] == 'O'){
                dfs(board, vis, drow, dcol, n-1, i);
            }

        }
        for(int i =0; i<n ; i++){
            if(board[i][m-1] == 'O'){
                dfs(board, vis, drow, dcol, i, m-1);
            }

        }

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(board[i][j] == 'O' && !vis[i][j]){
                    board[i][j] = 'X';
                }
            }
        }


    }


    void dfs(char[][] board , boolean[][] vis, int[] drow, int[] dcol, int i, int j){

        if(i<0 || i>= board.length ||j <0 || j>=board[0].length)
            return;

        vis[i][j] = true;

        for(int v=0; v<4; v++){

            int nrow = i+drow[v];
            int ncol = j+dcol[v];

            if(nrow<board.length && nrow>=0 && ncol< board[0].length && ncol>=0 && board[nrow][ncol] =='O' && !vis[nrow][ncol])
                dfs(board, vis, drow, dcol, nrow, ncol);
        }





    }
}
