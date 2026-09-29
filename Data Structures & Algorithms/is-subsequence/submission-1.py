class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        idx=0
        for i in t:
            if idx==len(s):
                return True
            if i==s[idx]:
                idx+=1
        print(idx)
        return idx == len(s)