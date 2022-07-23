package Trees.LeetcodeQuestions;

import Trees.TreeNode;

public class BalancedTreeOrNot {

//    https://leetcode.com/problems/balanced-binary-tree/
    boolean res = true;
    public boolean isBalanced(TreeNode root) {

        maxDepth(root);
        return res;
    }

    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;
        int c=0;
        int leftcount = maxDepth(root.left);
        int rightcount = maxDepth(root.right);

        if(Math.abs(leftcount - rightcount)>1)
            res = false;

        return 1+Math.max(leftcount, rightcount);

    }

    public boolean isBalanced2(TreeNode root) {

        return maxDepth2(root)!=-1;
    }

    public int maxDepth2(TreeNode root) {

        if(root == null)
            return 0;
        int c=0;
        int leftcount = maxDepth(root.left);
        int rightcount = maxDepth(root.right);

        if(leftcount==-1 || rightcount==-1)
            return -1;

        if(Math.abs(leftcount - rightcount)>1)
            return -1;

        return 1+Math.max(leftcount, rightcount);

    }
}
