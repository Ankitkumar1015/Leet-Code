class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None
        """
        a = len(nums)
        k = k % a  # handle cases where k > a
        b = []

        for i in range(a - k, a):
            b.append(nums[i])
        for i in range(0, a - k):
            b.append(nums[i])
        for i in range(a):
            nums[i] = b[i]
