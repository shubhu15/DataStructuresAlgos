class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        maxL=0

        for a in set(s):
            count =0 
            j=0
            i=0
            while j <len(s):
                if s[j]!=a:
                    count+=1
                
                
                while count>k:
                    if s[i]!=a:
                        count-=1
                    i+=1
                maxL = max( maxL, j-i+1)
                j+=1

        return maxL


        