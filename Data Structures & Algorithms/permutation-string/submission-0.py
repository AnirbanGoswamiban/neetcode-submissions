class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        map={}
        j=0
        for i in s1:
            if i in map:
                map[i]+=1
            else:
                map[i]=1
        map2={}
        k=len(s1)
        for i in range(len(s2)):
            if s2[i] in map2:
                map2[s2[i]]+=1
            else:
                map2[s2[i]] = 1
            while (i-j) + 1 > k:
                if s2[j] in map2:
                    map2[s2[j]]-=1
                    if map2[s2[j]] == 0:
                        del map2[s2[j]]
                j+=1
            if (i-j) + 1 == k:
                if map == map2:
                    return True
        return False
        