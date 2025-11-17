class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:

        i=0
        j=0
        hset =set()

        while j<len(nums):



            if abs(i-j)>k:
                hset.remove(nums[i])
                i+=1




            if nums[j] in hset:
                    return True
            hset.add(nums[j])
            j+=1

        return False
                
            
        