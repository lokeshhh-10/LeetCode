class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        out = []
        l = 0
        while l < len(nums):
            start = nums[l]
            while l+1 < len(nums) and nums[l+1] == nums[l]+1:
                l+=1
            end = nums[l]

            if(start == end):
                out.append(str(start))
            else:
                out.append(f"{start}->{end}")
            l+=1

        return out

