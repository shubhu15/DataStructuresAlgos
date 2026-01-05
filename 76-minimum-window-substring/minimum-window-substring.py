class Solution:
    def minWindow(self, s: str, t: str) -> str:

        from collections import Counter

        mapt = Counter(t)
        need= len(mapt)

        if len(t)> len(s):
            return ""
        mapS={}
        have=0
        minl =float("inf")
        res=[-1,-1]

        i=0
        for j in range(len(s)):
            mapS[s[j]] = mapS.get(s[j], 0) +1

            if s[j] in mapt and mapS[s[j]] == mapt[s[j]] :
                have+=1

            while have == need:
                if j-i+1 <minl:
                    res= [i,j+1]
                    minl= j-i+1
                
                if s[i] in mapt and mapS[s[i]] == mapt[s[i]]:
                    have-=1
                mapS[s[i]]-=1
                if mapS[s[i]]==0:
                    del mapS[s[i]]
                i+=1
        return s[res[0]:res[1]] if minl!=float("inf") else ""





        