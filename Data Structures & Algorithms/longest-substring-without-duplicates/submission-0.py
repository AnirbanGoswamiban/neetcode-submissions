class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        window=set()
        i=0
        maxlen=0
        for j in range (0,len(s)):
            while s[j] in window:
                window.remove(s[i])
                i+=1
            window.add(s[j])
            if len(window) > maxlen:
                maxlen=len(window)
        return maxlen


        