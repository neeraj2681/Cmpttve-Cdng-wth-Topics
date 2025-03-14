# import heapq
# https://leetcode.com/problems/reorganize-string/description/
class Solution:
    def reorganizeString(self, s: str) -> str:
        mapper = {}
        for char in s:
            mapper[char] = mapper.get(char, 0) + 1
        # print(mapper)
        # print(mapper.items())
        lc = ''
        def get_max(lc):
            maxer = -1
            k, v = '', 0
            # print(mapper)
            for key, val in mapper.items():
                if key == lc:
                    continue
                # print(key, val)
                if maxer < val:
                    k, v = key, val
                    maxer = val
            return k, v

        k, v = get_max(lc)

        if len(s) % 2 == 0 and v > len(s) // 2:
            return ""
        
        if len(s) % 2 != 0 and v > (1 + len(s) // 2):
            return ""
        


        ans = ""
        # lc = ''
        while mapper:
            k, v = get_max(lc)
            # print(k, v)
            lc = k
            ans = ans + k
            if v == 1:
                del mapper[k]
            else:
                mapper[k] = mapper[k] - 1
            # print(ans)
            # print(mapper)
        return ans


        


        

        

        