class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = sorted(list(s))
        t = sorted(list(t))

        if len(s)!=len(t):
            return False

        for i in range(len(s)):
            if s[i] != t[i]:
                return False
        return True
        