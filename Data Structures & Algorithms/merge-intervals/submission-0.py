class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda i: i[0])
        res=[]
        for i in intervals:
            if len(res)==0:
                res.append(i)
            else:
                prev=res[-1]
                if prev[1]>=i[0]:
                    res.pop(-1)
                    i[0]=min(prev[0],i[0])
                    i[1]=max(prev[1],i[1])
                res.append(i)
        return res
        