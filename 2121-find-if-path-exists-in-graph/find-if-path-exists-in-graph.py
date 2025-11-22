class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        if not edges:
            return True

        adj = defaultdict(list)

        for i, j in edges:
            adj[i].append(j)
            adj[j].append(i)

        visited = set()
        def dfs(s, d):
            visited.add(s)
            for a in adj[s]:
                if a == d:
                    return True
                if a not in visited:
                    if dfs(a,d):
                        return True
            return False

        return dfs(source, destination)

        

        