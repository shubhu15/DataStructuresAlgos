func missingNumber(nums []int) int {
    n :=len(nums)
    sum:=0
    for _,i := range nums{
        sum+=i
    }

    return n * (n+1)/2 - sum
    
}