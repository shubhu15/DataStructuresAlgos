class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        
        visited = set()
        adj = defaultdict(list)
        for i, j in tickets:
            adj[i].append(j)
            
        for i in adj:
            adj[i].sort(reverse=True)
            
        path =[]
        def dfs(s):
            
            while adj[s]:
                dfs(adj[s].pop())
            path.append(s)
        dfs("JFK")
        return path[::-1]