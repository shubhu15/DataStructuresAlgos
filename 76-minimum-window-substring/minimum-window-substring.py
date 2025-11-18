class Solution:
    def minWindow(self, s: str, t: str) -> str:

        mapT = Counter(t)
        want = len(mapT)
        mapS={}

        have =0
        minl = len(s)
        mins =""
        i=0
        j=0
        while j<len(s):
            mapS[s[j]] = 1+ mapS.get(s[j], 0) 
            if s[j] in mapT and mapS[s[j]] == mapT[s[j]]:
                have +=1

            while have == want:
                if j-i+1 <= minl:
                    minl = min(minl, j-i+1)
                    mins= s[i:j+1]

                mapS[s[i]]-=1
                if s[i] in mapT and mapS[s[i]]<mapT[s[i]]:
                    have -=1
                if mapS[s[i]]==0:
                    del mapS[s[i]]
                i+=1
            j+=1
        return mins



        