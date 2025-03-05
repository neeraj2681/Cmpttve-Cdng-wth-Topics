# https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        ans = 0
        lsum = 0

        for item in gain:
            lsum+=item
            if lsum > ans:
                ans = lsum

        return ans