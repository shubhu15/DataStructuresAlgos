func plusOne(digits []int) []int {

    
    n:=len(digits)-1
   
    lsb:= digits[n]+1
    
    if lsb<=9{
        digits[n]=lsb
        return digits
    } else {
        digits[n]=0
        add:=1
        i:=n-1

        for add==1{
            if i>=0{
                digits[i] = digits[i]+add
            } else{
                digits = append([]int{1}, digits...)
                return digits
            }
            if digits[i]>9{
                digits[i]=0
                add=1
            } else{
                add=0
            }
            i--



        }
        return digits
    }

    

 
    
}