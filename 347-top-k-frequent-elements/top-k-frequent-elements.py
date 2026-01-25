class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        count = Counter(nums)
        heap=[]
        for i,v in count.items():
            heapq.heappush(heap, (-v,i))

        res=[]
        
        for i in range(k):
            res.append(heapq.heappop(heap)[1])
        return res
        