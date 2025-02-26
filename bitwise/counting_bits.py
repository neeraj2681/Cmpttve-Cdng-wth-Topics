# https://leetcode.com/problems/counting-bits/?envType=study-plan-v2&envId=leetcode-75

import math
class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = [0] * (n + 1)
        for num in range(1, n+1, 1):
            if num % 2 != 0:
                ans[num] = ans[num - 1] + 1
            else:
                ans[num] = ans[num // 2]
        return ans


        
        