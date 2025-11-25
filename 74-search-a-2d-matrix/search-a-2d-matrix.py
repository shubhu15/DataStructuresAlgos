class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        row =len(matrix)
        col =len(matrix[0])

        i=0
        j=row*col -1

        while i<=j:
            mid = (i+j)//2
            val = matrix[mid//col][mid%col]

            if val== target:
                return True
            elif val>target:
                # i+=1
                j = mid-1
            else:
                i = mid+1


        return False
        