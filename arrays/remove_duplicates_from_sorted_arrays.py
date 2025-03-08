# https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1548177425/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if len(nums) == 1:
            return 1
        if len(nums) == 2:
            return len(set(nums))

        p1, p2, maxer = 1, 2, nums[0]
        ans = 1
        while  p2 < len(nums):
            if p1 == p2:
                if maxer < nums[p1]:
                    maxer = nums[p1]
                    p1+=1
                    p2+=1
                    ans+=1
                    continue
                else:
                    p2+=1
                    continue
            # swap needed
            if nums[p1] <= maxer:
                if nums[p2] > maxer:
                    nums[p1] = nums[p2]
                    maxer = nums[p1]
                    p1+=1
                    p2+=1
                    ans+=1
                else:
                    p2+=1
            # no swap
            else:
                maxer = nums[p1]
                p1+=1
                ans+=1
        return ans
                
        