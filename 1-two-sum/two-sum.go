func twoSum(nums []int, target int) []int {

    hmap := make(map[int]int)

    for i, val :=range nums {

        if v,ok:=hmap[target-val]; ok {
            return []int{v, i}
        }

        hmap[val] = i
    }

    return []int{-1, -1}
    
}