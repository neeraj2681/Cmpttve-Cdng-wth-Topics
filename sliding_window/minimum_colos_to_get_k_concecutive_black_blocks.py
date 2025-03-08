
# https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/?envType=daily-question&envId=2025-03-08
class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        p1, p2 = 0, k

        ans = sum([1 for x in blocks[:k] if x == 'W'])
        # print(ans)

        temp = ans

        while p2 < len(blocks):
            if blocks[p1] == 'W':
                temp-=1
            if blocks[p2] == "W":
                temp+=1
            if temp < ans:
                ans = temp
            p2+=1
            p1+=1
            if ans == 0:
                return ans
        return ans
            


        