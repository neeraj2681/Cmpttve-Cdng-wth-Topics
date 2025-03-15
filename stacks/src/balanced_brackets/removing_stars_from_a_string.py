# https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75
#Did it without a stack -- tc = O(n), sc = O(1) --although much slower than the stack solution
class Solution:
    def removeStars(self, s: str) -> str:
        p = len(s) - 1

        sc = 0
        ans = ""

        while p >= 0:
            if s[p] == '*':
                sc+=1
            elif sc == 0:
                ans = s[p] + ans
            else:
                sc-=1
            p-=1
        return ans


        