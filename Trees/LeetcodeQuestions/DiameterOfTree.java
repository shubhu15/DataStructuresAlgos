package Trees.LeetcodeQuestions;

import Trees.TreeNode;

public class DiameterOfTree {

//    https://leetcode.com/problems/diameter-of-binary-tree/
    public int dia = Integer.MIN_VALUE; // or use a int[] with
    // 1 length to store the dia and pass in the function call

    public int diameterOfBinaryTree(TreeNode root) {

        getdia(root);
        return dia;
    }

    public int getdia(TreeNode root){

        if(root ==null)
            return 0;

        int lh = getdia(root.left);
        int rh = getdia(root.right);

        dia = Math.max(dia, lh+rh);

        return 1+ Math.max(lh, rh);



    }
}
