func isHappy(n int) bool {

    set:= make(map[int]struct{})


    for n!=1 {
         if _, ok:=set[n]; ok{
            return false
        }
        set[n]= struct{}{}

        sum:=0
        for n>0 {
            sum += (n%10)*(n%10)
            n/=10
        }
        n=sum
        

    }
    return true

   

    


}