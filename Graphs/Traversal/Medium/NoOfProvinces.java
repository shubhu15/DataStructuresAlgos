package Graphs.Traversal.Medium;

import java.util.ArrayList;
import java.util.List;

public class NoOfProvinces {

//    https://leetcode.com/problems/number-of-provinces/
    public int findCircleNum(int[][] isConnected) {

        List<List<Integer>> adjList = new ArrayList<>();

        int n = isConnected.length;

        for(int i =0; i<=n; i++){
            adjList.add(new ArrayList());
        }

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i+1).add(j+1);
                    adjList.get(j+1).add(i+1);
                }
            }
        }

        boolean[] visited = new boolean[n+1];
        int ans=0;

        for(int i =1; i< n+1; i ++){

            if(!visited[i])
            {
                ans++;
                dfs(adjList, i, visited);

            }
        }

        return ans;
    }

    void dfs(List<List<Integer>> isc, int i , boolean[] vis){

        vis[i]= true;

        for(int j : isc.get(i) ){
            if(!vis[j])
                dfs(isc, j, vis);
        }

    }
}
