package Trees.LeetcodeQuestions;

import Trees.TreeNode;

import java.util.*;

public class VerticalOrderTraversalBT {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Queue<NodeAxis> q= new LinkedList<>();
        NodeAxis na = new NodeAxis(root,0,0);
        TreeMap<Integer, TreeMap< Integer, PriorityQueue<Integer>>> tmap = new TreeMap<>();

        q.add(na);
        while(!q.isEmpty()){
            NodeAxis temp = q.poll();
            if(tmap.containsKey(temp.row)){
                TreeMap< Integer, PriorityQueue<Integer>> tm = tmap.get(temp.row);
                if(tm.containsKey(temp.col)){
                    PriorityQueue<Integer> pq = tm.get(temp.col);
                    pq.add(temp.data.val);
                    tm.put(temp.col, pq);
                    tmap.put(temp.row, tm);
                }
                else{
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.add(temp.data.val);
                    tm.put(temp.col, pq);
                    tmap.put(temp.row,tm);
                }

            }
            else{
                TreeMap<Integer, PriorityQueue<Integer>> tmaptemp= new TreeMap<>();
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(temp.data.val);
                tmaptemp.put(temp.col, pq);
                tmap.put(temp.row,tmaptemp );
            }
            if(temp.data.left!=null)
            {
                q.add(new NodeAxis(temp.data.left, temp.row-1, temp.col+1));
            }
            if(temp.data.right!=null)
            {
                q.add(new NodeAxis(temp.data.right, temp.row+1, temp.col+1));
            }

        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> mp : tmap.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> p : mp.values()){
                while(!p.isEmpty()){
                    ans.get(ans.size()-1).add(p.poll());
                }
            }
        }

        return ans;



    }
}
class NodeAxis{
    TreeNode data;
    int row;
    int col;

    NodeAxis(TreeNode d, int r, int c){
        data = d;
        row =r;
        col = c;
    }

}