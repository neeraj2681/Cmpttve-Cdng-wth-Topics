# link: https://leetcode.com/problems/house-robber/description/?envType=study-plan-v2&envId=top-interview-150
#TC: O(n)
#SC: O(1)


class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        elif len(nums) == 2:
            return max(nums[0], nums[1])

        # ans = 0
        a1, a2 = nums[0], max(nums[0], nums[1])
        # print(a1, a2)
        # ans = m
        for i in range(2, len(nums), 1):
            if a1 + nums[i] > a2:
                # a1 = a2
                a1, a2 = a2, a1 + nums[i]
                # a1 = a2
            else:
                a1 = a2
            # print(i, nums[i], a1, a2)
        return a2
        


