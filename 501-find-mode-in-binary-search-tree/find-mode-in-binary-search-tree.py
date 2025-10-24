# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        hmap={}

        def dfs(node):
            if not node:
                return

            if node.val in hmap:
                hmap[node.val] +=1
            else:
                hmap[node.val] =1
            dfs(node.left)
            dfs(node.right)

        dfs(root)
        res=[]
        maxVal = max(hmap.values())
        for k,v in hmap.items():
            if v== maxVal:
                res.append(k)

        return res
        