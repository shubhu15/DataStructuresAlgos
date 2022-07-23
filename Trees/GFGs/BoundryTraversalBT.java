package Trees.GFGs;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BoundryTraversalBT {

//    https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
    ArrayList <Integer> boundary(TreeNode node)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(node)) ans.add(node.val);
        getLeftBoundary(node, ans);
        getLeafNodes(node, ans);
        getRightNodes(node, ans);

        return ans;
    }

    boolean isLeaf(TreeNode n){
        return n.left ==null && n.right == null;
    }

    void getLeftBoundary(TreeNode node, ArrayList<Integer> ans ){
        TreeNode c = node.left;
        while(c!=null){
            if(!isLeaf(c))
                ans.add(c.val);
            if(c.left!=null)
                c=c.left;
            else
                c=c.right;

        }

    }

    void getRightNodes(TreeNode node, ArrayList<Integer> ans ){
        TreeNode c = node.right;
        List<Integer> temp = new ArrayList<>();
        while(c!=null){
            if(!isLeaf(c))
                temp.add(c.val);
            if(c.right!=null)
                c=c.right;
            else
                c=c.left;

        }

        for(int i =temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));

        }

    }

    void getLeafNodes(TreeNode n, ArrayList<Integer> ans ){
        if(n==null)
            return;
        if(isLeaf(n))
        {ans.add(n.val);
            return;
        }

        getLeafNodes(n.left, ans);
        getLeafNodes(n.right, ans);
    }
}
