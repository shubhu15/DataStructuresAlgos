func findMin(nums []int) int {

    i:=0
    j:=len(nums)-1
    ans:=nums[j]

    for i<=j {
        if nums[i]< nums[j] {
            return min(ans, nums[i])
        }
            
        mid:= i+ (j-i)/2
        ans = min(ans, nums[mid])

        if nums[i]<=nums[mid] {
            i= mid+1
        } else {
            j=mid-1
        }
    }

    return ans
    
}