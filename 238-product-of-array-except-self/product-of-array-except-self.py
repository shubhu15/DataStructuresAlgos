class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        result=[1]*len(nums)
        for i in range(1, len(nums)):
            result[i]=nums[i-1]*result[i-1]
        print(result)
        suff=1

        for i in range(len(nums) - 2, -1, -1):
            suff = nums[i+1]*suff
            result[i]=result[i]*suff
            


        return result
        