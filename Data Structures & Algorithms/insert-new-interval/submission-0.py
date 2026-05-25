class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res=[]
        for i in range(len(intervals)):
            if newInterval[1]<intervals[i][0]:
                res.append(newInterval)
                j=i
                while(j<len(intervals)):
                    res.append(intervals[j])
                    j+=1
                # print(res)
                return res
            elif newInterval[0]>intervals[i][1]:
                res.append(intervals[i])
            else:
                newInterval[0]=min(newInterval[0],intervals[i][0])
                newInterval[1]=max(newInterval[1],intervals[i][1])
        res.append(newInterval)
        return res;

        