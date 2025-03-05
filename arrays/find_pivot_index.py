# https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        tsum = sum(nums)
        lsum = 0

        for i, item in enumerate(nums):
            # print(lsum, tsum, item)
            if (tsum - lsum - item) == lsum:
                return i
            else:
                lsum+=item
        return -1            
        