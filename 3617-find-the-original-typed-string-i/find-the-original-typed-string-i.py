class Solution:
    def possibleStringCount(self, word: str) -> int:
        l = 0
        r = 1
        count = 1
        while r <len(word):
            if word[l] == word[r]:
                count+=1
            l+=1
            r+=1
        return count



        