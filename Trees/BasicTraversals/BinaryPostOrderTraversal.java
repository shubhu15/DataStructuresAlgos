package Trees.BasicTraversals;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryPostOrderTraversal {

//    https://leetcode.com/problems/binary-tree-postorder-traversal/

    public List<Integer> postorderTraversal(TreeNode root) {


        List<Integer> lr = new ArrayList();

        postorder(root, lr);
        return lr;

    }

    void postorder(TreeNode root, List<Integer> lr ){

        if(root==null)
            return;

        postorder(root.left,lr);
        postorder(root.right,lr);
        lr.add(root.val);
    }
}
