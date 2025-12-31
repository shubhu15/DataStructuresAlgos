class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        def bins(s, e, val):
            while s<=e:
                mid = s + (e-s)//2
                if val==numbers[mid]:
                    return mid
                elif val<numbers[mid]:
                    e= mid-1
                else:
                    s=mid+1

            return -1
        
        res=[]
        for i, j in enumerate(numbers):

            num2 = target-j
            ind = bins(i+1, len(numbers)-1, num2)
            if ind!=-1:
                return [i+1, ind+1]

        