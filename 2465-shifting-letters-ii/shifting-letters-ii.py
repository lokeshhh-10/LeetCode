class Solution:
    def shiftingLetters(self, s: str, shifts: List[List[int]]) -> str:
        n = len(s) 
        v = [0] * (n + 1) 
        for shift in shifts: 
            l, r, c = shift 
            v[l] += (2 * c - 1) 
            v[r + 1] -= (2 * c - 1) 
        a = 0 
        result = list(s) 
        for i in range(n): 
            a += v[i] 
            p = (ord(s[i]) - ord('a') + a % 26 + 26) % 26 
            result[i] = chr(ord('a') + p) 
        return ''.join(result)