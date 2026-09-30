class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        idx=0
        for i in s:
            if idx == len(t):
                return 0
            if i == t[idx]:
                idx+=1
        return ((len(t)-1) - idx ) + 1
        