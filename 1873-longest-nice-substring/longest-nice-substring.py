class Solution:
    def longestNiceSubstring(self, s: str) -> str:

        hset = set(s)

        for i , n in enumerate(s):

            if n.swapcase() not in hset:
                s1 = self.longestNiceSubstring(s[:i])
                s2 = self.longestNiceSubstring(s[i+1:])

                return s1 if len(s1)>= len(s2) else s2
        return s        