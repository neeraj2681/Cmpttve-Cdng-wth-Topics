# https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxer = max(candies)
        ans = []
        for x in candies:
            if x + extraCandies >= maxer:
                ans.append(True)
            else:
                ans.append(False)
        return ans

        