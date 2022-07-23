package Trees.LeetcodeQuestions;

import Trees.TreeNode;

public class MaxPathSum {

//    https://leetcode.com/problems/binary-tree-maximum-path-sum/
    public int sum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        sum(root);
        return sum;
    }

    public int sum(TreeNode root){

        if(root ==null)
            return Integer.MIN_VALUE;

        int maxl =Math.max(0,sum(root.left));

        int maxr =Math.max(0,sum(root.right));

        sum = Math.max(sum,root.val + maxl+maxr);

        return root.val + Math.max(maxl,maxr);


    }
}
