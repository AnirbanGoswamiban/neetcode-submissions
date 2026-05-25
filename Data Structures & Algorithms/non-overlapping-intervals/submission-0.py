class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda i:i[0])
        count = 0
        for i in range(len(intervals)):
            if i == 0 :
                continue
            prev = intervals[i-1]
            if prev[1] > intervals[i][0] :
                intervals[i][0]=min(intervals[i][0],prev[0])
                intervals[i][1]=min(intervals[i][1],prev[1])
                count+=1

        return count
        