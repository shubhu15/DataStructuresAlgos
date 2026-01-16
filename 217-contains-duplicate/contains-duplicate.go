func containsDuplicate(nums []int) bool {

    smap := make(map[int]int)

    for _,v:= range nums {
        smap[v]++
        if smap[v]>1{
            return true
        }

    }
    return false
    
}