func eraseOverlapIntervals(intervals [][]int) int {
    
    sort.Slice(intervals, func(i, j int) bool {
        return intervals[i][1]<intervals[j][1]
    })

    res:=0

    merge:=intervals[0][1]
    for i:=1; i<len(intervals); i++{
        if intervals[i][0]<merge {
            res+=1
            merge = min(merge, intervals[i][1])
        } else {
            merge = intervals[i][1]
        }
    }

    return res
}