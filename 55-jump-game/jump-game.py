class Solution:
    def canJump(self, nums: List[int]) -> bool:

        maxJ =0
        for i, n in enumerate(nums):
            if i>maxJ:
                return False

            maxJ = max(maxJ, i+n)

        return True

        


        