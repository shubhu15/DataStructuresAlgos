class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        adj = defaultdict(list)

        for i,j, t in times:
            adj[i].append((j,t))

        start = k
        end = n
        visited ={}
        min_heap =[(0,k)]

        while min_heap:
            curr_time, u = heapq.heappop(min_heap)

            if u in visited:
                continue
            
            visited[u] = curr_time

            for v, w in adj[u]:
                if v not in visited:
                    heapq.heappush(min_heap, (curr_time+ w , v))

        if len(visited)==n:
            return max(visited.values())

        return -1


        