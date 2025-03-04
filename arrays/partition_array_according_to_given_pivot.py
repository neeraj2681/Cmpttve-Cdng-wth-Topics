# https://leetcode.com/problems/partition-array-according-to-given-pivot/description/?envType=daily-question&envId=2025-03-03

class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        lefti, pivoti = 0, 0

        for item in nums:
            if item < pivot:
                lefti+=1
            elif item == pivot:
                pivoti+=1

        righti = lefti + pivoti

        ans = [0] * len(nums)
        lindex, mindex, rindex = 0, lefti, lefti + pivoti

        for item in nums:
            if item < pivot:
                ans[lindex] = item
                lindex+=1
            elif item > pivot:
                ans[rindex] = item
                rindex+=1
            else:
                ans[mindex] = item
                mindex+=1
        return ans

            

        