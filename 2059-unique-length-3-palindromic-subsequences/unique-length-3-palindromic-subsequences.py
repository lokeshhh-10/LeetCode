class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        visi = set()
        n = len(s)
        i = 0
        j = n - 1
        result = 0
        
        while i < n - 2:
            if s[i] not in visi:
                k = j
                while k > i + 1 and s[k] != s[i]:
                    k -= 1
                if k - i == 1:
                    i += 1
                    continue
                else:
                    visi.add(s[i])
                    hash_set = set()
                    for l in range(i + 1, k):
                        hash_set.add(s[l])
                    result += len(hash_set)
                    ch = s[i]
                    while i < n and s[i] == ch:
                        i += 1
            else:
                i += 1
        
        return result