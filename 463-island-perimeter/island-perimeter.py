class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        self.peri=0
        self.visited=set()
        dr = [(0,1), (1,0), (-1,0) , (0,-1)]


        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    for a,b in dr:
                        di = i+a
                        dj = j+b
                        if di<0 or dj<0 or di==m or dj==n or grid[di][dj]==0:
                            self.peri+=1


        # def dfs(i, j):
        #     if i<0 or j<0 or i==m or j==n or grid[i][j]==0 or (i,j) not in self.visited:
        #         return

            
        #     self.visited.add((i,j))


        #     for a,b in dr:
        #         di = i+a
        #         dj = j+b
        #         if di<0 or dj<0 or di==m or dj==n or grid[di][dj]==0:
        #             self.peri+=1
        #         if (di, dj) not in self.visited:
        #             dfs(di, dj)

        # dfs(0,0)
        return self.peri
                    



        