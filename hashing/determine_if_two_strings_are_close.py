# https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75
from collections import Counter
class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        mapper1 = Counter(word1)
        mapper2 = Counter(word2)

        lister1 = mapper1.values()
        lister2 = mapper2.values()

        if sorted(lister1) == sorted(lister2) and mapper1.keys() == mapper2.keys():
            return True
        return False


        
        