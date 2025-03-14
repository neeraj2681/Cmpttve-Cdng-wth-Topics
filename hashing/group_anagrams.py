# https://leetcode.com/problems/group-anagrams/description/
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        def get_hashcode(s):
            temp = [0] * 26

            for c in s:
                temp[ord(c) - 97]+=1
            
            return tuple(temp)

        mapper = {}
        
        for item in strs:
            key = get_hashcode(item)
            if key in mapper:
                mapper[key] = mapper[key] + [item]
            else:
                mapper[key] = [item]

        # print(type(mapper.values()))
        # print(mapper.values())
        return list(mapper.values())
                     