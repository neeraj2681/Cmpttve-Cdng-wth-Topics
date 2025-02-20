# https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        p1 = len(digits) - 1

        while p1 >= 0:
            digits[p1] = digits[p1] + carry
            carry = digits[p1] // 10
            digits[p1]%=10
            p1-=1
        if carry > 0:
            return [carry] + digits
        return digits
        