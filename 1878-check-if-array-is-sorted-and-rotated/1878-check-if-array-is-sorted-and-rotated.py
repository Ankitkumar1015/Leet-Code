class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        count = 0
        n = len(nums)
    
        for i in range(n - 1):
            if nums[i] > nums[i + 1]:  # Check for decrease
                count += 1
    
        if nums[n - 1] > nums[0]:  # Check last element with first
            count += 1
    
        return count <= 1  # At most one drop allowed

    
        