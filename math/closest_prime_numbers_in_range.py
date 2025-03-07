# https://leetcode.com/problems/closest-prime-numbers-in-range/description/?envType=daily-question&envId=2025-03-07
#Try different approach---sieve of erothesnes???
class Solution:
    def closestPrimes(self, left: int, right: int) -> List[int]:

        def is_prime(n):
            counter = 0
            for i in range(1, int(math.sqrt(n)) + 1, 1):
                # print(i)
                # jar = i + 1
               
                if n % i == 0:
                    counter+=1
                if counter > 1:   
                    return False
            return True
        
        lprime = -1 * math.inf
        min_range = right - left + 1
        ans = [-1, -1]

        for item in range(left, right + 1, 1):
            if item == 1:
                continue    
            # print(item)
            if is_prime(item):
                if min_range > (item - lprime):
                    min_range = item - lprime
                    ans = [lprime, item]
                    if min_range <= 2:
                        return ans
                # print(lprime, item, ans)
                lprime = item
        return ans
                
                

                
        
                
                

                
        