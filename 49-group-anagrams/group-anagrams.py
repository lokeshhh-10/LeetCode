class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        grp = {}

        for word in strs:
            key = tuple(sorted(word))

            if key not in grp:
                grp[key] = []

            grp[key].append(word)

        return list(grp.values())