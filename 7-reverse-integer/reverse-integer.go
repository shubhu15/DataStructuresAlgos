func reverse(x int) int {


    res:=0
    const max = math.MaxInt32 // 2147483647
    const min = math.MinInt32
    for x!=0 {
        res = res*10 + x%10
        x=x/10
    }
    if res > max || res<min {
        return 0
    }

    return res
    
}