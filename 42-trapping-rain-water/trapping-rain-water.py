class Solution:
    def trap(self, height: List[int]) -> int:

        left =[0]*(len(height)+1)
        left[0] = height[0]
        right=[0]*(len(height)+1)
        right[len(height)-1] = height[-1]

        for i, a in enumerate(height):
            left[i+1]=max(left[i], a)

        for i in range(len(height)-1,-1,-1):
            right[i-1] = max(right[i], height[i])

        
        trapped=0
        for i,a in enumerate(height):
            trapped +=max(min(left[i], right[i]) - a, 0)
        
        return trapped
        