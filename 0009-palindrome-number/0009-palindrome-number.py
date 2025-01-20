class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        a= str(x)
        rev = a[::-1]

        if rev==a:
            return True
        else :
            return False