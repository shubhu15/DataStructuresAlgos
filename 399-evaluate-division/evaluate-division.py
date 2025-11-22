class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:

        adj = defaultdict(list)

        for i, eq  in enumerate(equations):
            adj[eq[0]].append((eq[1], values[i]))
            adj[eq[1]].append((eq[0], 1/values[i]))
        # print(adj)

        def dfs(s, d , ans, visited):
            
            visited.add(s)
            ret=-1
            for a,val in adj[s]:
                if a == d:
                    ret= ans*val
                    return ret
                if a in visited:
                    continue
                else:
                    ret= dfs(a, d, ans*val, visited)
                if ret!=-1:
                    break
            visited.remove(s)
            return ret
        res=[]
        for i, j in queries:
            if i not in adj or j not in adj:
                ret= -1
            else:
                visited = set()
                ret = dfs(i, j, 1, visited)
            res.append(ret)
        return res

            
            
        