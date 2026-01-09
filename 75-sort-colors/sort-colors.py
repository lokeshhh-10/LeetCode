class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = 1
        while l < len(nums):
            min_index = l
            while r < len(nums):
                if nums[r] < nums[min_index]:
                    min_index = r
                r+=1
            nums[l], nums[min_index] = nums[min_index], nums[l]
            l+=1
            r = l+1
                
        