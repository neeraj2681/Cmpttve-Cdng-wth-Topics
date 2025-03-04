# https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
import math
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        ans = sum(nums[:k]) / k
        rolling_mean = ans
        p2 = k
        # print(ans)
        while p2 < len(nums):
            rolling_mean = (rolling_mean * k - nums[p2 - k] + nums[p2]) / k
            if ans < rolling_mean:
                ans = rolling_mean
            # print(p2, ans)
            p2+=1

        return ans

        