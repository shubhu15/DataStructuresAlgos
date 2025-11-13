class Solution:
    def fullBloomFlowers(self, flowers: List[List[int]], people: List[int]) -> List[int]:

        sort_p =[]
        for i, p in enumerate(people):
            sort_p.append((p, i))

        res=[0]*len(people)
        flowers.sort()
        sort_p.sort()

        min_heap=[]
        ind=0

        for p, i in sort_p:

            while ind<len(flowers) and flowers[ind][0]<=p:
                heapq.heappush(min_heap, flowers[ind][1])
                ind+=1

            while min_heap and min_heap[0]<p:
                heapq.heappop(min_heap)

            if min_heap:
                res[i] = len(min_heap)

        return res
        