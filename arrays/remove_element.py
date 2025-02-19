# https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        p1, p2 = 0, len(nums) - 1

        ans = 0
        while p1 <= p2:
            if nums[p1] == val and nums[p2] != val:
                nums[p1], nums[p2] = nums[p2], nums[p1]
                p1+=1
                p2-=1
                ans+=1
            elif nums[p1] != val and nums[p2] != val:
                p1+=1
            elif nums[p1] != val and nums[p2] == val:
                ans+=1
                p2-=1
                p1+=1
            else:
                ans+=1
                p2-=1
            # print(nums_
        return len(nums) - ans
        