# https://leetcode.com/problems/two-sum/description/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapper = {x: i  for i, x in enumerate(nums)}
        for i, item in enumerate(nums):
            req = target - item
            if req in mapper and mapper.get(req) != i:
                return [i, mapper.get(req)]
            
            

        