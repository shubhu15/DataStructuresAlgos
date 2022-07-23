package Trees.LeetcodeQuestions;

import Trees.TreeNode;

import java.util.*;

public class ZigZagTraversal {

//    https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        queue.offer(root);
        int flag =0;
        while(!queue.isEmpty()){
            int s = queue.size();
            List<Integer> ls = new ArrayList();

            for(int i =0;i<s;i++){
                TreeNode temp = queue.poll();
                ls.add(temp.val);
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
            }
            flag = flag==0?1:0;

            if(flag==1)
                ans.add(ls);
            else
            {
                Collections.reverse(ls);
                ans.add(ls);
            }

        }

        return ans;
    }
}
