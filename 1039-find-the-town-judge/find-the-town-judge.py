class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:

        adj=defaultdict(list)

        for i, j in trust:
            adj[i].append(j)

        cand =-1

        for i in range(1,n+1):
            if i not in adj:
                cand=i

        for i in range(1, n+1):
            if cand==i:
                continue
            if cand not in adj[i]:
                return -1

        return cand

        