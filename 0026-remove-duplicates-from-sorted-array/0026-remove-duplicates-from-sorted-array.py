class Solution:
    def removeDuplicates(self, nums):
        
        a = len(nums)
        i = 0
        while i < a:
            j = i + 1
            while j < a:
                if nums[i] == nums[j]:
                    nums.pop(j)
                    a -= 1  # update length after popping
                else:
                    j += 1  # only increment if no pop
            i += 1
        return len(nums)

    
