class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:

        currsum = sum(nums[0:k])
        i=0
        j=k
        maxSum = currsum

        while j<len(nums):
            if j-i+1 >k:
                currsum -= nums[i]
                i+=1
            
            currsum += nums[j]
            maxSum = max(currsum, maxSum)
            j+=1

        return maxSum/k

        
        