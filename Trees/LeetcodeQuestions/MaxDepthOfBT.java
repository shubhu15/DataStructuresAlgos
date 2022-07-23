package Trees.LeetcodeQuestions;

import Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBT {

//    https://leetcode.com/problems/maximum-depth-of-binary-tree/

    // APPROACH - RECURSIVE
    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;
        int c=0;
        int leftcount = maxDepth(root.left);
        int rightcount = maxDepth(root.right);

        c =1+Math.max(leftcount, rightcount);

        return c;

    }

    // APPROACH - LEVEL ORDER - BFS
    public int maxDepth2(TreeNode root) {

        if(root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int max_depth = Integer.MIN_VALUE;
        int dep =0;

        while(!q.isEmpty()){
            int size = q.size();
            // dep++;
            for(int i=0; i<size; i++){
                TreeNode t = q.poll();
                // dep++;


                if(t.left!=null)
                    q.add(t.left);

                if(t.right!=null)
                    q.add(t.right);
            }

            dep++;

        }

        return dep;

    }

}
