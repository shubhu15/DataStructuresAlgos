class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        dirc = [(1,0), (-1,0) , (0,1), (0,-1)]

        def dfs(r,c, visited):

            if r<0 or c<0 or r==m or c==n:
                return
            
            visited.add((r,c))
            for dr,dc in dirc:
                nr= r+dr
                nc= c+dc
                if nr>=0 and nc>= 0 and nr<m and nc<n and (nr, nc) not in visited and heights[nr][nc]>= heights[r][c]:
                    dfs(nr, nc, visited)

        pacific_vis = set()
        atlantic_vis = set()

        m = len(heights)
        n = len(heights[0])

        for i in range(n):
            dfs(0,i, pacific_vis)
            dfs(m-1, i, atlantic_vis)

        for i in range(m):
            dfs(i, 0, pacific_vis)
            dfs(i, n-1, atlantic_vis)

        res= list(pacific_vis.intersection(atlantic_vis))
        return res

      
            

        