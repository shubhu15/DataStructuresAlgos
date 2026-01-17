func countBits(n int) []int {

    arr := make([]int,0, n+1)
    k:=0


    for k<n+1 {
        cnt :=0
        temp:=k
        for temp!=0{
            if (temp&1) == 1 {
                cnt++

            }
            temp=temp>>1
        }
        arr = append(arr, cnt)
        k++
    }
    return arr
    
}