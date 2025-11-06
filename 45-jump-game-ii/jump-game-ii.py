class Solution:
    def jump(self, nums: List[int]) -> int:

        max_far =0
        curr_end=0
        jump=0

        for i in range(len(nums)-1):
            max_far = max(max_far, i +  nums[i])

            if i == curr_end:
                jump +=1
                curr_end = max_far
        return jump

        