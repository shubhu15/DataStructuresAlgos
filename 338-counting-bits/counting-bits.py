class Solution:
    def countBits(self, n: int) -> List[int]:
        ans  = [0]*(n+1)

        for i in range(n+1):
            cnt=0
            x=i
            while i:
                i = i & (i-1)
                cnt+=1
            ans[x]=cnt

        return ans

        