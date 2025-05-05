class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        r = len(nums)
        b = [i for i in range(r + 1)]  # Full range from 0 to n
        for num in nums:
            b.remove(num)  # Safely remove each number that exists in nums
        return b[0] 


        