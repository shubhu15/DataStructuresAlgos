type MyCircularQueue struct {
    k int
    count int
    arr []int
    begin int
    top int
    
}


func Constructor(k int) MyCircularQueue {
    return MyCircularQueue {
        k: k,
        arr: make([]int,k),
        begin: 0,
        top: -1,
        count: 0,
    }
    
}


func (this *MyCircularQueue) EnQueue(value int) bool {
    if this.IsFull() {
        return false
    }
    this.top = (this.top +1) % this.k
    this.arr[this.top]=value
    this.count++
    return true
    
}


func (this *MyCircularQueue) DeQueue() bool {
    if this.IsEmpty () {
        return false
    } 
    this.begin = (this.begin+1)%this.k
    this.count--
    return true
    
}


func (this *MyCircularQueue) Front() int {
    if this.IsEmpty() {
        return -1
    }
    return this.arr[this.begin]
    
}


func (this *MyCircularQueue) Rear() int {
    if this.IsEmpty() {
        return -1
    }
    return this.arr[this.top]
    
}


func (this *MyCircularQueue) IsEmpty() bool {
    if this.count==0 {
        return true
    }
    return false
    
}


func (this *MyCircularQueue) IsFull() bool {
    if this.count== this.k {
        return true
    }
    return false
    
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * obj := Constructor(k);
 * param_1 := obj.EnQueue(value);
 * param_2 := obj.DeQueue();
 * param_3 := obj.Front();
 * param_4 := obj.Rear();
 * param_5 := obj.IsEmpty();
 * param_6 := obj.IsFull();
 */