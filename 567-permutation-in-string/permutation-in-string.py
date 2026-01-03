class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        from collections import Counter

        mapS1 = Counter(s1)
        mapS2={}
        print(mapS1)


        l=0
        for r in range(len(s2)):
            mapS2[s2[r]] = mapS2.get(s2[r], 0) + 1
        
            if r - l + 1 == len(s1):
                if mapS2 == mapS1:
                    return True
            
                mapS2[s2[l]] -= 1
                if mapS2[s2[l]] == 0:
                    del mapS2[s2[l]]  
                l += 1
            


        return False



            


        