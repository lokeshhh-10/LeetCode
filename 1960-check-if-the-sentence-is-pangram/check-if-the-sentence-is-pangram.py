class Solution:
    def calculateAscii(self, val: str)-> int:
        cnt = 0
        for letter in val:
            cnt= cnt + ord(letter)
        return cnt

    def checkIfPangram(self, sentence: str) -> bool:
        total_cnt = self.calculateAscii("abcdefghijklmnopqrstuvwxyz")
        res = self.calculateAscii("".join(set(sentence)))
        print(res)
        if res!= total_cnt:
            return False
        return True