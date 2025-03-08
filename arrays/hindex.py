# https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
class Solution:
    def hIndex(self, citations: List[int]) -> int:

        #SORT method
        # citations = sorted(citations, reverse = True)
        # # print(citations)

        # ans = 0
        # for i, item in enumerate(citations):
        #     if item >= i + 1:
        #         ans = max(ans, min(item, i + 1))
        # return ans

        #counting sort method
        maxer = max(citations)
        counter = [0] * (maxer + 1)
        for item in citations:
            counter[item]+=1

        ans = 0
        # print(counter)
        rsum = 0

        for i, item in enumerate(counter[::-1]):
            rsum+=item
            # if (maxer - i) >= rsum:
            ans = max(ans, min(rsum, maxer - i))
            # print("ans: ", ans, rsum, maxer - i, i)
        return ans

            

        