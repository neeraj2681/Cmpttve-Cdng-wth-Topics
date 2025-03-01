# https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:

        p1 = 0
        if len(flowerbed) == 1:
            if flowerbed[p1] == 0:
                n-=1
            if n <= 0:
                return True
            return False

        while p1 < len(flowerbed):
            if p1 == 0:
                if flowerbed[p1] == 0 and flowerbed[p1 + 1] == 0:
                    n-=1
                    flowerbed[p1] = 1
            elif p1 == len(flowerbed) - 1:
                if flowerbed[p1] == 0 and flowerbed[p1 - 1] == 0:
                    n-=1
                    flowerbed[p1] = 1
            else:
                if flowerbed[p1] == 0 and flowerbed[p1 -1] == 0 and flowerbed[p1 + 1] == 0:
                    n-=1
                    flowerbed[p1] = 1
            p1+=1
        if n <= 0:
            return True
        return False