class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:


        maxLen=0
        i=0
        j=0
        hset=set()

        while j<len(s):

            while i<len(s) and s[j] in hset:
                hset.remove(s[i])
                i+=1
            maxLen = max(maxLen, j-i+1)

            hset.add(s[j])
            j+=1

        return maxLen
        