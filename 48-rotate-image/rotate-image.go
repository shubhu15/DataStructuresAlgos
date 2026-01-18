func rotate(matrix [][]int)  {
    n := len(matrix)

    for i:=0; i<n; i++{
        for j:=i+1 ; j<n; j++{
            matrix[i][j], matrix[j][i] = matrix[j][i] , matrix[i][j]
        }
    }

    for i:=0; i<n ;i++{
        j:=0
        k:= n-1 
        for j<=k {
           
            matrix[i][j], matrix[i][k] = matrix[i][k], matrix[i][j]
            k--
            j++
        }
    }
    
}