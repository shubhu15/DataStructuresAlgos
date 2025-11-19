# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True

        def bal(node):
            if not node:
                return True, 0
            l, lh = bal(node.left)
            r, rh = bal(node.right)
            if abs(lh-rh)>1:
                return False, 0

            if l and r:
                return True, max(lh, rh)+1
            
            return False, 0

        ans, _ = bal(root)
        return ans
        