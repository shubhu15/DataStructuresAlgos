type CustomStack struct {
    arr []int
    size int
}


func Constructor(maxSize int) CustomStack {
    return CustomStack{
        arr: make([]int, maxSize),
        size: 0,
    }
    
}


func (this *CustomStack) Push(x int)  {
    if this.size< len(this.arr) {
        this.arr[this.size]= x
        this.size++
        return
    }

    
}


func (this *CustomStack) Pop() int {
    if this.size==0 {
        return -1
    }
    n:= this.arr[this.size-1]
    this.arr[this.size-1]=0
    this.size--
    return n

    
}


func (this *CustomStack) Increment(k int, val int)  {
    
    for i:=0; i<k && i<this.size;i++ {
        this.arr[i] +=val
    }
    
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * obj := Constructor(maxSize);
 * obj.Push(x);
 * param_2 := obj.Pop();
 * obj.Increment(k,val);
 */