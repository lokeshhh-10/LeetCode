class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        res = 0
        l = 0
        while l < len(nums) -1:
            r = l+1
            while r < len(nums):
                if nums[l] == nums[r] and l < r:
                    res+=1
                r+=1
            l+=1
        return res