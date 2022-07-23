package Trees.BasicTraversals;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryInorderTraversalDFS {

//    https://leetcode.com/problems/binary-tree-inorder-traversal/
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> lr = new ArrayList();

        inorder(root, lr);
        return lr;

    }

    void inorder(TreeNode root, List<Integer> lr ){

        if(root==null)
            return;

        inorder(root.left,lr);
        lr.add(root.val);
        inorder(root.right,lr);
    }
}
