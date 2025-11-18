class Solution:
    def maxConsecutiveAnswers(self, answerKey: str, k: int) -> int:
        maxL = 0
        for a in set(answerKey):
            count=0
            i=0
            for j in range(len(answerKey)):
                if answerKey[j] != a:
                    count+=1

                while count>k:
                    if answerKey[i]!=a:
                        count-=1
                    i+=1
                maxL = max(maxL, j-i+1)

        return maxL

        