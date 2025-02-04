#Problem link @LeetCode: https://leetcode.com/problems/product-of-array-except-self/description/

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        lproduct = [1]
        for i in range(1, len(nums), 1):
            lproduct.append(lproduct[-1] * nums[i - 1])
        
        # ans = [0] * len(nums)

        # ans[-1] = lproduct[-1]
        rproduct = nums[-1]

        for i in range(len(nums) - 2, -1, -1):
            # print(nums[i])
            # print(f"rproduct: {rproduct}")
            lproduct[i] = rproduct * lproduct[i]
            rproduct = rproduct * nums[i]
        # print(lproduct)
        return lproduct
            
        