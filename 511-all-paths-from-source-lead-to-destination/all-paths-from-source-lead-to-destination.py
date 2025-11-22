class Solution:
    def leadsToDestination(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        visited = set()
        adj = defaultdict(list)
        
        for i, j in edges:
            adj[i].append(j)
        memo = set()
            
        def dfs(curr):
            if curr in visited:
                return False
            if curr in memo:
                return True
            
            if not adj[curr] :
                return curr== destination
            visited.add(curr)
            for a in adj[curr]:
                if not dfs(a):
                    return False
            memo.add(curr)
            visited.remove(curr)
            return True
        
        return dfs(source)
            