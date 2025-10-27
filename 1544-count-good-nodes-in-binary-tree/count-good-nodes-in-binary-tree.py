# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        self.count=0

        def dfs(node, max_so_far):
            if not node:
                return

            if node.val>=max_so_far:
                max_so_far = node.val
                self.count+=1

            dfs(node.left, max_so_far)
            dfs(node.right, max_so_far)

        dfs(root, float('-inf'))

        return self.count
        