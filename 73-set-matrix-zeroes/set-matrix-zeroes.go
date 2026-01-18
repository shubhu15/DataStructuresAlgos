type Pair struct {
    i,j int
}

func setZeroes(matrix [][]int)  {

    m := len(matrix)
    n := len(matrix[0])
    mySet := make(map[Pair]struct{})

    for i:=0; i<m; i++{
        for j:=0; j<n; j++ {
            if matrix[i][j] ==0{
                mySet[Pair{i,j}]= struct{}{}
            }
        }
    }

    for k := range mySet {
        i := k.i
        j := k.j

        for k:=0; k<n; k++ {
                    
            matrix[i][k]=0
                              
        }

        for k:=0;k<m;k++ {      

            matrix[k][j]=0      
                    
        }

    }

    


    
}