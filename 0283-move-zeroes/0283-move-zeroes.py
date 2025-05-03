class Solution(object):
    def moveZeroes(self,nums):
        pos = 0  # position to place the next non-zero element

    # First pass: move non-zeroes forward
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[pos] = nums[i]
                if pos != i:
                    nums[i] = 0
                pos += 1
