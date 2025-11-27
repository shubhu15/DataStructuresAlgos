class Solution:
    def minMutation(self, startGene: str, endGene: str, bank: List[str]) -> int:


        def preprocess(bank):

            hmap=defaultdict(list)

            for gene in bank:
                n = len(gene)
                for i in range(n):
                    key = gene[:i]+'*'+ gene[i+1:]
                    hmap[key].append(gene)

            return hmap

        if endGene not in bank:
            return -1

        hmap= preprocess(bank)


        que = deque()
        visited = set()
        que.append((startGene, 0))

        while que:
            end, dis = que.popleft()
            if end == endGene:
                return dis


            n = len(end)
            for i in range(n):
                key = end[:i]+'*'+ end[i+1:]
                for k in hmap[key]:
                    if k not in visited:
                        que.append((k, dis+1))
                        visited.add(k)

        return -1



        