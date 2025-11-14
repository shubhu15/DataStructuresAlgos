class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxp=0
        minp= float("inf")
        for i in range(len(prices)):
            minp = min(minp, prices[i])
            pro = prices[i]- minp
            if pro>maxp:
                maxp = pro


        return maxp

        