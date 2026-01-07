class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minp = float("inf")

        curr=0
        for i in prices:
            minp = min(minp, i)
            pro= i-minp
            curr = max(curr, pro)
        return curr