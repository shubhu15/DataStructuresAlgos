class Solution:
    def taskSchedulerII(self, tasks: List[int], space: int) -> int:

        hmap = {}
        curr_day =0 

        for i, j in enumerate(tasks):
            curr_day +=1
            if j not in hmap:
                hmap[j] = curr_day
            else:
                last_day = hmap[j]
                early_day = last_day + space +1
                curr_day = max(curr_day, early_day)
                hmap[j]= curr_day

        return curr_day

        