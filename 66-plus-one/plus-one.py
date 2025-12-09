class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s = [str(i) for i in digits]
        num = int("".join(s)) + 1
        return [int(i) for i in str(num)]
        
        
        