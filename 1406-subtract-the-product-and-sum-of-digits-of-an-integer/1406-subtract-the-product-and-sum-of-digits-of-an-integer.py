class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        for i in range (len(str(n))):
            summ =0 
            prod=1
            while n>0:
                d= n%10
                summ = summ + d
                prod = prod*d
                n//=10
            return (prod-summ)
