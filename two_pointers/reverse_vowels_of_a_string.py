# https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def reverseVowels(self, s: str) -> str:
        ans = ""
        p1, p2 = 0, len(s) - 1
        vowels = ('a', 'e', 'i', 'o', 'u',
         'A', 'E', 'I', 'O', 'U')

        lhalf, rhalf = "", ""

        while p1 < p2:
            if s[p1] in vowels and s[p2] in vowels:
                lhalf = lhalf + s[p2]
                rhalf = s[p1] + rhalf
                p1+=1
                p2-=1
            elif s[p1] in vowels:
                rhalf = s[p2] + rhalf
                p2-=1
            elif s[p2] in vowels:
                lhalf = lhalf + s[p1]
                p1+=1
            else:
                rhalf = s[p2] + rhalf
                lhalf = lhalf + s[p1]
                p1+=1
                p2-=1
        if p1 <= p2:
            lhalf = lhalf + s[p1]
        
        return lhalf + rhalf

        
        