# https://leetcode.com/problems/n-th-tribonacci-number/submissions/1595137938/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0

        if n == 1:
            return 1
        
        if n == 2:
            return 1
        
        a1, a2, a3 = 0, 1, 1
        ans = 0
        for n in range(3, n + 1, 1):
            ans = a1 + a2 + a3
            a1, a2, a3 = a2, a3, ans
        return ans

        