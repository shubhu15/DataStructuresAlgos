class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        n_list = set(nums)
        max_len=0

        for s in n_list:
            if s-1 not in n_list:
                cnt=1
                while s+cnt in n_list:
                    cnt+=1
                max_len = max(max_len, cnt)

        return max_len
        