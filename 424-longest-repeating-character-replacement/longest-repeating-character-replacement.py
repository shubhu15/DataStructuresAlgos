class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        ns = set(s)

        maxl =0
        for i in ns:
            cnt=0
            l=0
            for j, val in enumerate(s):
                if val!=i:
                    cnt+=1
                

                while cnt >k:
                    if s[l]!=i:
                
                        cnt-=1
                    l+=1
                maxl = max(maxl, j-l+1)

        return maxl



                