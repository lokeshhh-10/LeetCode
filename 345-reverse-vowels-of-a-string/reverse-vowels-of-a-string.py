class Solution:
    def reverseVowels(self, sentence: str) -> str:
        s =  list(sentence)
        vow = "aeiouAEIOU"
        l = 0
        r = len(s) -1
        while l < r:
            if s[l] in vow and s[r] in vow:
                s[l],s[r] = s[r],s[l]
                l+=1
                r-=1
            elif s[l] not in vow:
                l+=1
            else:
                r-=1
        return "".join(s)