class Solution:
    def totalFruit(self, fruits: List[int]) -> int:

        mapF={}
        i=0
        maxl=0
        for j in range(len(fruits)):
            mapF[fruits[j]]= 1+ mapF.get(fruits[j], 0)

            while len(mapF)>2:
                mapF[fruits[i]]-=1
                if mapF[fruits[i]]==0:
                    del mapF[fruits[i]]
                i+=1
            maxl = max(maxl, j-i+1)
        return maxl


        