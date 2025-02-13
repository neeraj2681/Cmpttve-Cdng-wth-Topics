# https://leetcode.com/problems/coin-change/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        coins = sorted(coins, reverse = True)
        # print(coins)
        coins_needed = [0] * (amount + 1)

        for money in range(1, len(coins_needed), 1):
            change_avl = False
            for coin in coins:
                if money - coin >= 0 and coins_needed[money - coin] != -1:
                    temp_ans = coins_needed[money - coin] + 1
                    if coins_needed[money] == 0 or coins_needed[money] > temp_ans:
                        coins_needed[money] = temp_ans
                    change_avl = True
                    # break
            if not change_avl:
                coins_needed[money] = -1
    
        # print(sorted([(i, x) for i, x in enumerate(coins_needed) if x == 20], reverse = True))
        # print(coins_needed)   
        

        return coins_needed[-1]
                
                

        