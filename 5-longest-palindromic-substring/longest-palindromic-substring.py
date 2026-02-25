class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) < 2:
            return s
        res = ""
        l = 0
        r = 0
        while l < len(s):
            while r < len(s):
                sub_arr = s[l:r+1]
                if(sub_arr == sub_arr[::-1] and len(sub_arr) > len(res)):
                    out = s[l:r+1]
                r+=1
            if(len(res) < len(out)):
                res = out
            l+=1
            r = l+1
        return res
                
        