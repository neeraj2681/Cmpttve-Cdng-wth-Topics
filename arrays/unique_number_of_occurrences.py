# https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:

        mapper = {}

        for item in arr:
            if item in mapper:
                mapper[item] = mapper[item] + 1
            else:
                mapper[item] = 1
        if len(set(arr)) == len(set(mapper.values())):
            return True
        return False