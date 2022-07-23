package Trees.BasicTraversals;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryPreOrderTraversal {
//    https://leetcode.com/problems/binary-tree-preorder-traversal/

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> lr = new ArrayList();

        preorder(root, lr);
        return lr;

    }

    void preorder(TreeNode root, List<Integer> lr ){

        if(root==null)
            return;

        lr.add(root.val);
        preorder(root.left,lr);
        preorder(root.right,lr);

    }
}
