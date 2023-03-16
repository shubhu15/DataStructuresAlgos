package Graphs.Traversal.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

//    https://leetcode.com/problems/flood-fill/
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        int prevColor = image[sr][sc];

        int[][] ans = image;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};

        dfs(image, ans, sr,sc,prevColor, color, drow, dcol);

        return ans;
    }

    public void dfs(int[][] image, int[][] ans, int i , int j,int prevcol,  int color,
                    int[] drow, int[] dcol){

        ans[i][j] = color;

        int n = image.length;
        int m = image[0].length;

        for(int c=0; c<4; c++){

            int nrow = i+drow[c];
            int ncol = j+dcol[c];

            if(nrow<n && nrow>=0 && ncol<m && ncol>=0 && image[nrow][ncol] == prevcol && image[nrow][ncol]!= color)

                dfs(image, ans, nrow, ncol, prevcol, color, drow, dcol);
        }


    }


    void bfs(int[][] image, int[][] ans, int i, int j, int preColor,
             int color, int[] drow, int[] dcol){


        ans[i][j] = color;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});

        int n = image.length;
        int m = image[0].length;

        while(!q.isEmpty()){


            int[] temp = q.poll();
            int x=temp[0];
            int y =temp[1];

            for(int c=0; c<4; c++){

                int nrow = x + drow[c] ;
                int ncol = y + dcol[c];

                if(nrow<n && nrow>=0 && ncol<m && ncol>=0 && image[nrow][ncol] == preColor && image[nrow][ncol]!= color){
                    ans[nrow][ncol] = color;
                    q.add(new int[]{nrow, ncol});
                }


            }

        }

    }

}
