class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:


        que = deque()
        res=[]

        for i, num in enumerate(nums):

            while que and nums[que[-1]]<num:
                que.pop()

            que.append(i)

            if que[0]<= i-k:
                que.popleft()


            if i>=k-1:
                res.append(nums[que[0]])

        return res

            


        