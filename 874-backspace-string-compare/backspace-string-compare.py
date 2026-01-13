class Solution:
    def validate(self, text) -> str:
        flag = 0
        res = ""
        for char in reversed(text):
            if char == "#":
                flag+=1
                continue
            if flag and char != "#":
                flag-=1
                continue
            res+=char
        return res[::-1]

    def backspaceCompare(self, s: str, t: str) -> bool:
        s_val = self.validate(s)
        t_val = self.validate(t)
        return s_val == t_val