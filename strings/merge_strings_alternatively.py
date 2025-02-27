# https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ans = ''.join(x+y for x, y in zip(word1, word2))
        if len(word1) > len(word2):
            ans = ans + ''.join(x for x in word1[len(word2):])
        elif len(word1) < len(word2):
            ans = ans + ''.join(x for x in word2[len(word1):])
        return ans

        