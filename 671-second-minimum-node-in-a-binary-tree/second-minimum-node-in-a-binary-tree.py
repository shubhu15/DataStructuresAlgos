# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findSecondMinimumValue(self, root: Optional[TreeNode]) -> int:

        def dfs(node):
            if not node:
                return float('inf')

            if currmin < node.val:
                return node.val
            return min(dfs(node.left), dfs(node.right))

        
        currmin=root.val
        secmin = dfs(root)
        return secmin if secmin != float('inf') else -1



            
        