# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        if not postorder or not inorder:
            return None
        root = postorder[-1]
        root_ind = inorder.index(root)
        node = TreeNode(root)
        left = root_ind
        
        node.left = self.buildTree(inorder[:root_ind], postorder[:left])
        node.right = self.buildTree(inorder[root_ind+1 :], postorder[left:-1])
        
        return node
        
        