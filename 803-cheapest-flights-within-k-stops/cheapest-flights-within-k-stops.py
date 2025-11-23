class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:

        adj = defaultdict(list)
        for u, v, cost in flights:
            adj[u].append((v, cost))

        visited =[float('inf')]*n
        cost_dis = [ float('inf')]*n
        cost_dis[src]=0
        min_heap = [(0,src, 0)]

        while min_heap:
            curr , s, stops = heapq.heappop(min_heap)

            if s == dst:
                return curr
            if stops>k:
                continue
            if visited[s]<=stops:
                continue
            visited[s] = stops
            

            for v, cost in adj[s]:
                
                heapq.heappush(min_heap, (curr+cost, v, stops+1))

        return -1


        