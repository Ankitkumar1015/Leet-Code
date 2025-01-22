class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
    
        a=len(nums)
        kist=[0]*a
        for i in range (a):
            kist[i]=nums[nums[i]]
            # list[i]=i

        return kist


        