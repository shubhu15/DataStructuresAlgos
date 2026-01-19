import "sort"

func merge(intervals [][]int) [][]int {

    res:= make([][]int,0 )

   
    sort.Slice(intervals, func(i,j int) bool {
        return intervals[i][0]<=intervals[j][0]
    })
    res = append(res, intervals[0])

    for i:=0; i<len(intervals);i++{
        start:= intervals[i][0]
        end:= intervals[i][1]
        l:=len(res)-1
        if start <= res[l][1] {
            res[l][1]= max(end, res[l][1])
        } else {
            res= append(res, []int{start, end})
        }
    }
    return res
    
}