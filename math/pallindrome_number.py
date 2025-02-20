# https://leetcode.com/problems/palindrome-number/description/?envType=study-plan-v2&envId=top-interview-150
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        reverse = 0

        temp = x
        while temp != 0:
            reverse = reverse * 10 + temp % 10
            temp = temp // 10
        if x == reverse:
            return True
        return False
        