class UnionFind:

    def __init__(self, size):
        self.root = list(range(size))
        self.rank =[1]*size

    def find(self, x):
        if x== self.root[x]:
            return x
        self.root[x] = self.find(self.root[x])
        return self.root[x]

    def union(self, x, y):
        rootx = self.find(x)
        rooty = self.find(y)

        if rootx==rooty:
            return False
        
        if self.rank[rootx]> self.rank[rooty]:
            self.root[rooty] = rootx
        elif self.rank[rooty]> self.rank[rootx]:
            self.root[rootx] = rooty
        else:
            self.root[rooty]= rootx
            self.rank[rootx]+=1
        return True

class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:

        n = len(points)

        edges =[]

        for i in range(n):
            for j in range(i+1, n):
                dis = abs(points[i][0] - points[j][0]) + abs(points[i][1] - points[j][1])
                edges.append((dis, i, j))

        edges.sort()
        uf = UnionFind(n)
        minc =0
        edge=0


        for dis, i,j in edges:
            if uf.union(i, j):
                minc +=dis
                edge+=1
                if edge==n-1:
                    break

        return minc




        