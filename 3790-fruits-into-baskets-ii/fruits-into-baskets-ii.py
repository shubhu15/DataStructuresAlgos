class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:

        b= [False]*len(baskets)
        for i in fruits:
            for ind,j in enumerate(baskets):
                if j>=i and  not b[ind]:
                    b[ind]=True
                    break

        return len(fruits)-sum([1 for t in b if t])
        