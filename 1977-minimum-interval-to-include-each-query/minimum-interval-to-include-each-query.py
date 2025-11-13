class Solution:
    def minInterval(self, intervals: List[List[int]], queries: List[int]) -> List[int]:

        intervals.sort(key = lambda x:x[0])
        sort_q =[]
        for i, q in enumerate(queries):
            sort_q.append((q,i))

        sort_q.sort()
        res=[-1]*len(queries)
        min_heap=[]
        ind =0

        for q, i in sort_q:
            
            while ind<len(intervals) and intervals[ind][0]<=q:
                dis = intervals[ind][1] - intervals[ind][0]+1
                heapq.heappush(min_heap, (dis, intervals[ind][1]))
                ind+=1
            
            while min_heap and min_heap[0][1]<q:
                heapq.heappop(min_heap)

            if min_heap:
                res[i] = min_heap[0][0]

        return res

            
        

        # for q in queries:
        #     minr = float('inf')
        #     for interval in intervals:
        #         if q<interval[0] or q>interval[1]:
        #             continue

        #         minr = min(minr, interval[1]- interval[0]+1)
        #     if minr == float('inf'):
        #         res.append(-1)
        #     else:
        #         res.append(minr)

        # return res

        

                

        