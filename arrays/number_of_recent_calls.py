# https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75
class RecentCounter:

    def __init__(self):
        self.rings = []
        self.start = 0

    def ping(self, t: int) -> int:
        self.rings.append(t)
        while self.start < len(self.rings):
            if self.rings[self.start] >= (t - 3000):
                break
            self.start+=1
        return len(self.rings) - self.start


        


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)