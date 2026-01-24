

func leastInterval(tasks []byte, n int) int {


    if n==0 {
    return len(tasks)
    }

    cnt:= make([]int, 26)
    for _, t := range tasks{

    cnt[t -'A']++
    }

    var maxCount, sameMax int
    for _,c := range cnt {
    if c> maxCount {
    maxCount=c
    sameMax =1
    } else if c==maxCount {
    sameMax++
    }
    
    }

    res := (n + 1) * (maxCount - 1) + sameMax
    if (res > len(tasks)) {
        return res
    } else {
        return len(tasks)
    }



}