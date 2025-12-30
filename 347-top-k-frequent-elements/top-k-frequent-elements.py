class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        from collections import Counter

        cnt = Counter(nums)
        heap=[]
        for i in cnt.items():
            heapq.heappush(heap, (-i[1], i[0]))
        res=[]
        for i in range(k):
            res.append( heapq.heappop(heap)[1])

        return res
     