package Graphs.Traversal.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

//    https://leetcode.com/problems/rotting-oranges/
    public int orangesRotting(int[][] grid) {


        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];

        int minutes =0;

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        Queue<int[]> q = new LinkedList<>();

        for(int i =0; i<n ;i++){
            for(int j =0; j<m; j++){

                if(grid[i][j]==2){
                    visited[i][j] =2; // mark visited
                    q.add(new int[]{i, j,0});
                    // add the timestamp start time for each '2'
                }

            }
        }

        minutes =  bfs(grid, visited,q, drow, dcol);

        for(int i =0; i<n; i++){
            for(int j =0; j<m ; j++){
                if(grid[i][j] ==1 && visited[i][j] !=2)
                    return -1;
            }
        }

        return minutes;
    }

    int bfs(int[][] grid, int[][] vis,Queue<int[]> q,  int[] drow, int[] dcol){


        int n = grid.length;
        int m = grid[0].length;

        int minTime=0;

        while(!q.isEmpty()){


            int[] temp = q.poll();
            int x=temp[0];
            int y =temp[1];

            minTime = Math.max(minTime, temp[2]);
            int time = temp[2]+1;



            for(int c=0; c<4; c++){

                int nrow = x + drow[c] ;
                int ncol = y + dcol[c];

                if(nrow<n && nrow>=0 && ncol<m && ncol>=0 && grid[nrow][ncol] == 1 && vis[nrow][ncol]!=2){
                    vis[nrow][ncol] = 2;
                    q.add(new int[]{nrow, ncol, time});
                }


            }

        }

        return minTime;

    }


}
