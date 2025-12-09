class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        val = ''
        out = []
        for i in digits:
            val+=str(i)
        val = str(int(val) + 1)
        for i in range(len(val)):
            out.append(int(val[i]))
        return out
        
        
        