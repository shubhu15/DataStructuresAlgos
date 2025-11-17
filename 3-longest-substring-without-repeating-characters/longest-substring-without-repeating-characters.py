class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        i=0
        j=0
        hset=set()
        maxl =0

        while j<len(s):
            while hset and s[j] in hset:
                hset.remove(s[i])
                i+=1

            hset.add(s[j])
            maxl = max(maxl, j-i+1)


            j+=1

        return maxl
        