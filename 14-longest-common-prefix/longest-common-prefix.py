class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        min_words = min(strs, key=len)
        prefix = ""

        for i in range(len(min_words)):
            cur_char = min_words[i]

            for word in strs:
                if(word[i] != cur_char):
                    return prefix
            
            prefix+=cur_char

        return prefix

           


        