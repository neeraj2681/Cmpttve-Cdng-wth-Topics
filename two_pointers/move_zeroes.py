# https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        p1, p2 = 0, 1

        while p2 < len(nums):
            if p1 == p2:
                p2+=1
                continue

            if nums[p1] == 0 and nums[p2] != 0:
                nums[p1], nums[p2] = nums[p2], nums[p1]
                p1+=1
                p2+=1
            elif nums[p1] == 0:
                p2+=1
            else:
                p1+=1
            # print(p1, p2, nums)
        return nums