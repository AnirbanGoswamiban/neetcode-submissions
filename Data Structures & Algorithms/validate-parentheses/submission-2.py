class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        for i in s:
            if i == '[' or i == '{' or i == '(':
                st.append(i)
            elif i == ']' and st and st[-1] == '[':
                st.pop()
            elif i == '}' and st and st[-1] == '{':
                st.pop()
            elif i == ')' and st and st[-1] == '(':
                st.pop()
            else:
                st.append(i)
        if len(st) == 0:
            return True
        return False