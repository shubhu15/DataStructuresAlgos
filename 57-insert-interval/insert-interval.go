func insert(intervals [][]int, newInterval []int) [][]int {
    
    res:= make([][]int,0 )

    for i,v:= range intervals {

        start:=v[0]
        end:=v[1]
        if newInterval[0]>end{
            res= append(res, intervals[i])
        } else if newInterval[1]< start {
            res = append(res, newInterval)
            newInterval = intervals[i]
        } else {
            newInterval[0]= min(newInterval[0], start)
            newInterval[1]= max(newInterval[1], end)
        }
    }
    res = append(res, newInterval)

    return res

}