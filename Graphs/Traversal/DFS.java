package Graphs.Traversal;

import java.util.ArrayList;

public class DFS {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];

        dfs(adj, ans, vis, 0);

        return ans;
    }

    void dfs( ArrayList<ArrayList<Integer>> adj,  ArrayList<Integer> ans, boolean[] vis, int n){


        vis[n] =true;
        ans.add(n);

        for(int i : adj.get(n)){
            if(!vis[i]){
                dfs(adj, ans, vis, i);
            }
        }
    }
}
