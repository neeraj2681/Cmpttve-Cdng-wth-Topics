# https://leetcode.com/problems/min-cost-climbing-stairs/description/?envType=study-plan-v2&envId=leetcode-75
#bottom-up dp(without extra space)

class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        cost_ledger1 = 0
        cost_ledger2 = 0

        i = 2
        while i < len(cost) + 1:
            cost_ledger2, cost_ledger1 = min(cost_ledger1 + cost[i - 2], cost_ledger2 + cost[i - 1]), cost_ledger2

            i+=1
        return cost_ledger2
        