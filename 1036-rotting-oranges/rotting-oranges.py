class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        
        que = deque()
        m= len(grid)
        n= len(grid[0])
        fresh_or =0
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 2:
                    que.append((i, j))
                if grid[i][j]==1:
                    fresh_or +=1
        if fresh_or == 0:
            return 0

        time=-1   
        dirc = [(1,0), (0,1), (-1,0), (0,-1)]   
        while que:
            l = len(que)
            
            for i in range(l):
                
                curri, currj = que.popleft()
                for r,c in dirc:
                    dr = r+curri
                    dc= c+currj
                    if 0<= dr < m and 0<= dc<n and grid[dr][dc]==1:
                        grid[dr][dc]=2
                        que.append((dr, dc))
                        fresh_or-=1
            time+=1
        return time if fresh_or==0 else -1


            
        