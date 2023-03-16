package Graphs.Traversal.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Nearest01Distance {

//    https://leetcode.com/problems/01-matrix/

    public int[][] updateMatrix(int[][] mat) {


        int n = mat.length;
        int m = mat[0].length;

        boolean[][] vis = new boolean[n][m];
        int[][] dis = new int[n][m];

        Queue<int[]> qu = new LinkedList<>();

        int[] drow ={-1,0,1, 0};
        int[] dcol = {0,1,0,-1};


        for(int i =0; i< n; i++){

            for(int j =0; j<m ; j++){

                if(mat[i][j] == 0){
                    vis[i][j] = true;
                    qu.add(new int[]{i,j,0});
                    dis[i][j] = 0;
                }

            }

        }

        bfs(vis, mat, dis, drow, dcol, qu);


        return dis;
    }

    void bfs(boolean[][] vis, int[][] mat, int[][] dis, int[] drow, int[] dcol,
             Queue<int[]> qu){

        int n = mat.length;
        int m = mat[0].length;

        while(!qu.isEmpty()){

            int[] temp = qu.poll();
            int i = temp[0];
            int j = temp[1];
            int d = temp[2]+1;

            for(int c =0; c<4; c++){

                int nrow = i + drow[c];
                int ncol = j + dcol[c];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                        !vis[nrow][ncol] && mat[nrow][ncol] ==1){
                    vis[nrow][ncol] = true;
                    qu.add(new int[]{ nrow, ncol, d});
                    dis[nrow][ncol] =d;

                }

            }


        }



    }

    // OPTIMISED DP SOLUTION
    public int[][] updateMatrix2(int[][] mat) {
        int m = mat.length, n = mat[0].length, INF = m + n; // The distance of cells is up to (M+N)
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 0) continue;
                int top = INF, left = INF;
                if (r - 1 >= 0) top = mat[r - 1][c];
                if (c - 1 >= 0) left = mat[r][c - 1];
                mat[r][c] = Math.min(top, left) + 1;
            }
        }
        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                if (mat[r][c] == 0) continue;
                int bottom = INF, right = INF;
                if (r + 1 < m) bottom = mat[r + 1][c];
                if (c + 1 < n) right = mat[r][c + 1];
                mat[r][c] = Math.min(mat[r][c], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}
