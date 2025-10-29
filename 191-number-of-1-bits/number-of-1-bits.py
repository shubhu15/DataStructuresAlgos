class Solution:
    def hammingWeight(self, n: int) -> int:
        s= bin(n)[2:]
        add = [ int(a) for a in s]

        return sum(add)
        