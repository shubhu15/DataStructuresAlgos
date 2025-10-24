# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:

        res=[]

        def dfs(node, curr):
            if not node:
                return
            if node and not node.left and not node.right:
                s= str(node.val)
                if len(curr)>=1:
                    s = '->'.join(curr) + '->' + str(node.val)
                
                res.append(s)
                return

            curr.append(str(node.val))
            dfs(node.left, curr)
            dfs(node.right, curr)
            curr.pop()

        dfs(root, [])
        return res

        