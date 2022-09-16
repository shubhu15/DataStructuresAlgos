package Graphs.Traversal.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {

//    https://leetcode.com/problems/number-of-islands/

    public static void main(String[] args) {
        String[][] grid = {
                {"1","1","0","0","0"},{"1","1","0","0","0"},{"0","0","1","0","0"},{"0","0","0","1","1"}
        };
        char[][] grid2 = new char[grid.length][grid[0].length];
        for (int i =0; i<grid.length; i++){
            for (int j =0; j< grid[0].length ; j++){
                grid2[i][j] = grid[i][j].toCharArray()[0];
            }
        }
        System.out.println(numIslands(grid2));
    }

    public static int numIslands(char[][] grid) {

        int n = grid.length;
        boolean[][] vis = new boolean[n][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        int ans =0;

        for(int i =0; i<grid.length; i++){
            for(int j =0; j< n ; j++){

                if(grid[i][j]=='1' && !vis[i][j]){
                    ans++;
                    bfs(i, j, grid, vis, q);
                }

            }
        }

        return ans;
    }

    static void bfs(int i, int j, char[][] grid, boolean[][] vis, Queue<int[]> q){

        vis[i][j] =true;
        q.add(new int[]{i, j});

        while(!q.isEmpty()){

            int[] temp = q.poll();
            int x=temp[0];
            int y =temp[1];

            if(x>0 && grid[x-1][y] == '1' && !vis[x-1][y] )
            {
                vis[x-1][y]= true;
                q.add(new int[]{x-1, y});
            }
            if(y>0 && grid[x][y-1] == '1' && !vis[x][y-1])
            {
                vis[x][y-1]= true;
                q.add(new int[]{x, y-1});
            }
            if(x>=0 && x<grid.length-1 && grid[x+1][y] == '1' && !vis[x+1][y] )
            {
                vis[x+1][y]= true;
                q.add(new int[]{x+1, y});
            }
            if(y>=0 && y<grid[0].length-1 && grid[x][y+1] == '1' && !vis[x][y+1])
            {
                vis[x][y+1]= true;
                q.add(new int[]{x, y+1});
            }

        }


    }
}
