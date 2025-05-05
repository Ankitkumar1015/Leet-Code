class Solution(object):
    def moveZeroes(self,nums):
        p = 0  # position to place the next non-zero element

    # First pass: move non-zeroes forward

        for i in range(len(nums)):
            if nums[i] != 0:
                nums[p],nums[i]=nums[i],nums[p]
                p+=1
        return nums