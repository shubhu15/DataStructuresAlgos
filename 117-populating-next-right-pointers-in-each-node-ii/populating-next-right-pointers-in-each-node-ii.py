"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        q= deque()
        if not root:
            return root
        q.append(root)
        while q:
            l = len(q)
            for i in range(l):
                r = q.popleft()
                if i==l-1:
                    r.next=None
                else:
                    r.next= q[0]
                if r.left:
                    q.append(r.left)
                if r.right:
                    q.append(r.right)
        return root
        