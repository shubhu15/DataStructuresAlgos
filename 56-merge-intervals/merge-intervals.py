class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals)
        ans = [intervals[0]]
        for s, e in intervals:
            if s <= ans[-1][1]:
                ans[-1][1] = max(ans[-1][1], e)
            else:
                ans.append([s,e])
        return ans

        