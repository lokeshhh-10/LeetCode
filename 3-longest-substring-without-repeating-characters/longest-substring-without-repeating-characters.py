class Solution:
    
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        res = 0
        l = 0

        while l < len(s):
            r = l
            cur = 0
            while r < len(s):
                if s[r] not in seen:
                    seen.add(s[r])
                    cur+=1
                    r+=1
                else:
                    break
            res = max(cur, res)
            seen.clear()
            l+=1
        return res
