# https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        magmap = Counter(magazine)
        for x in ransomNote:
            if x in magmap:
                if magmap[x] > 1:
                    magmap[x]-=1
                else:
                    del magmap[x]
            else:
                return False

        return True
        