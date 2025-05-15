class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0 
        b=0
        while c!=len(nums):
            a=0
            for j in range (c, len(nums)):
                if (nums[j]==1):
                    a+=1
                    c+=1
                else:
                    c+=1
                    break
            if (a>b):
                b=a
        return b
        