# https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        rmap = {}
        for item in grid:
            temp = tuple(item)
            if temp in rmap:
                rmap[temp] = rmap[temp] + 1
            else:
                rmap[temp] = 1

        ans = 0
        for item in zip(*grid):
            temp = tuple(item)
            ans+=rmap.get(temp, 0)
        return ans
            
