"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        visited ={}

        def clone(original_node):
            if not original_node:
                return
            if original_node in visited:
                return visited[original_node]
            clone_node = Node(original_node.val)
            visited[original_node] = clone_node
            clone_node.neighbors =[]
            clone_node.neighbors = [clone(n) for n in original_node.neighbors]
            return clone_node

        
        return clone(node)

        