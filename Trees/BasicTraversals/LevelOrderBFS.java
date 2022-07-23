package Trees.BasicTraversals;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBFS {

//    https://leetcode.com/problems/binary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root== null)
            return ans;

        q.offer(root);

        while(!q.isEmpty()){

            int len = q.size();
            List<Integer> ls = new ArrayList<>();

            for(int i =0;i<len; i++){

                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);

                ls.add(q.poll().val);
            }
            ans.add(ls);
        }

        return ans;

    }
}
