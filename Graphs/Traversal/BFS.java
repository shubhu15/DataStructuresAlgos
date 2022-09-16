package Graphs.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
//    https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();

        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0]=true;

        while(!q.isEmpty()){

            Integer n = q.poll();
            arr.add(n);

            for(int i : adj.get(n)){

                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

        return arr;
    }
}
