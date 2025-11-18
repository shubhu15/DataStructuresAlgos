class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        maxL=0
        count ={}
        max_f =0
        i=0
        for j in range(len(s)):
            count[s[j]] = 1+ count.get(s[j], 0)
            max_f = max(max_f, count[s[j]])

            while j-i+1 - max_f >k:
                count[s[i]]-=1
                i+=1

            maxL = max(maxL, j-i+1)

        return maxL


        