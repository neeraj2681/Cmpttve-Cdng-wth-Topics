# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
#not optimal(in terms of operations) -- see the solutions @Leetcode to understand optimized versions
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1, p2, e, counter = 0, 1, nums[0], 1

        while p2 < len(nums):
            if nums[p2] != e:
                temp = min(2, counter)
                while temp > 0:
                    nums[p1] = e
                    p1+=1
                    temp-=1
                e = nums[p2]
                counter = 1
            else:
                counter+=1
                e = nums[p2]
            p2+=1
            print(p2, p1, counter, e)
        # if e
        temp = min(counter, 2)

        while temp > 0:
            nums[p1] = e
            p1+=1
            temp-=1
        return p1
        