class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:

        def bfs(i,j):
            if grid[i][j]!=0:
                return -1
            n= len(grid)
            if grid[n-1][n-1] !=0:
                return -1
            que = deque()
            que.append((i,j, 1))
            vis =set()
            vis.add((i,j))
            dirc = [(1,0), (0,1), (-1,0), (0,-1), (-1,-1), (1,1), (1,-1), (-1,1)]
            

            while que:
                curri, currj , dis = que.popleft()
                if curri ==n-1 and currj==n-1:
                    return dis

                for r,c in dirc:
                    dr= r+curri
                    dc= c+currj
                    if dr >=0 and dc>=0 and dr< n and dc<n and grid[dr][dc] == 0 and (dr, dc) not in vis:
                        vis.add((dr,dc))
                        que.append((dr,dc, dis+1))

            return -1

        return bfs(0,0)
                

        