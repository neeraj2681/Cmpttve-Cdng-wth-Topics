# https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ans = nums[0]
        for num in nums[1:]:
            ans ^= num
        return ans

        