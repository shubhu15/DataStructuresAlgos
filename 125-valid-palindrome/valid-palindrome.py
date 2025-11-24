class Solution:
    def isPalindrome(self, s: str) -> bool:

        
        cleaned_s = ''.join(char.lower() for char in s if char.isalnum())

        i=0
        n= len(cleaned_s)
        j=n-1

        while i<=j:
            if cleaned_s[i]!=cleaned_s[j]:
                    return False
            i+=1
            j-=1

            

        return True
        