class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        n = len(nums)
        if n<=1:
            return 0
        
        end = -1
        max_seen = nums[0]
        for i in range(1,n):
            if nums[i]<max_seen:
                end = i
            else:
                max_seen = nums[i]
        
        if end == -1:
            return 0
            
        start = -1
        min_seen = nums[n-1]
        for i in range(n-2,-1,-1):
            if nums[i]>min_seen:
                start = i
            else:
                min_seen = nums[i]
        
        return end-start+1