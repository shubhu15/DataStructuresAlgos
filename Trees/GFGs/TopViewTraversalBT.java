package Trees.GFGs;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewTraversalBT {

//    https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
    static ArrayList<Integer> topView(TreeNode root)
    {
        // add your code

        Queue<NodeAxis> q= new LinkedList<>();
        NodeAxis na = new NodeAxis(root,0);
        TreeMap<Integer, Integer> tmap = new TreeMap<>();

        q.add(na);
        while(!q.isEmpty()){
            NodeAxis temp = q.poll();
            if(!tmap.containsKey(temp.row)){
                tmap.put(temp.row, temp.data.val);

            }
            if(temp.data.left!=null)
            {
                q.add(new NodeAxis(temp.data.left, temp.row-1));
            }
            if(temp.data.right!=null)
            {
                q.add(new NodeAxis(temp.data.right, temp.row+1));
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer mp : tmap.values()){
            ans.add(mp);
        }

        return ans;

    }
}

class NodeAxis{
    TreeNode data;
    int row;

    NodeAxis(TreeNode d, int r){
        data = d;
        row =r;
    }

}