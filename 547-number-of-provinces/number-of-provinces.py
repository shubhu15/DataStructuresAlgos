class UnionFind:
    def __init__(self, size):
        self.root = list(range(size))
        self.rank = [1]*size
        
    def find(self, x):
        if x== self.root[x]:
            return x

        self.root[x] = self.find(self.root[x])
        return self.root[x]
    
    def union(self, x, y):
        rootx = self.find(x)
        rooty = self.find(y)
        if rootx!=rooty:
            if self.rank[rootx]>self.rank[rooty]:
                self.root[rooty]= rootx
            elif self.rank[rooty]> self.rank[rootx]:
                self.root[rootx] = rooty
            else:
                self.root[rooty] = rootx
                self.rank[rootx]+=1
                
class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n= len(isConnected)
        uf = UnionFind(n)
        num = n
        for i in range(n):
            for j in range(i+1, n):
                if isConnected[i][j]==1 and uf.find(i)!= uf.find(j):
                    num-=1
                    uf.union(i,j)
        
            
        return num