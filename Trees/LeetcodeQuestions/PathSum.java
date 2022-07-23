package Trees.LeetcodeQuestions;

import Trees.TreeNode;

public class PathSum {


//    https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
            return false ;
        if(root.left==null && root.right==null && root.val == targetSum) // edge case + the return logic
            return true;
        return hasPathSum(root.left, targetSum-root.val) ||
                hasPathSum(root.right, targetSum- root.val);

    }

}
