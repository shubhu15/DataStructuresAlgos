func findMin(nums []int) int {

    i:=0
    j:=len(nums)-1
    ans:=nums[j]

    for i<=j {
        
            
        mid:= i+ (j-i)/2
        ans = min(ans, nums[mid])

        if nums[j]>nums[mid] {
            j= mid-1
        } else {
            i=mid+1
        }
    }

    return ans
    
}