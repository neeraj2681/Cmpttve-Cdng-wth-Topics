class Solution:
    def minOperations(self, grid: List[List[int]], x: int) -> int:
        mapper = []
        sarr = []
        for item in grid:
            for ritem in item:
                if not mapper:
                    mapper.append(ritem % x)
                else:
                    if ritem % x not in mapper:
                        return -1
                sarr.append(ritem)

        nsteps = 0
        sarr = sorted(sarr)
        ind = sarr[len(sarr) // 2]
        for item in sarr:
            nsteps+=(abs(item - ind) // x)
        return nsteps

                
        