type Node struct {
    val int
    next *Node
}

type MyLinkedList struct {

    dummy *Node
    index int 
}


func Constructor() MyLinkedList {
    return MyLinkedList {
        dummy: &Node{},
        index: 0,
    }
    
}


func (this *MyLinkedList) Get(index int) int {
    if index<0 || index>= this.index {
        return -1
    }
    prev:= this.dummy.next
    for i:=0; i<index;i++ {
        prev= prev.next
    }
    return prev.val
    
}


func (this *MyLinkedList) AddAtHead(val int)  {
    
    
        node := &Node {val, this.dummy.next}
        this.dummy.next = node
        this.index++
        

    
}


func (this *MyLinkedList) AddAtTail(val int)  {

    prev:= this.dummy
    for i:=0; i<this.index;i++ {
        prev= prev.next
    }

    node:=&Node{val: val, next: prev.next}
    prev.next= node
    this.index++
    
}


func (this *MyLinkedList) AddAtIndex(index int, val int)  {
    if index<0 || index> this.index {
        return 
    }
    prev:= this.dummy
    for i:=0; i<index;i++ {
        prev= prev.next
    }

    node:=&Node{val: val, next: prev.next}
    prev.next= node
    this.index++
    
}


func (this *MyLinkedList) DeleteAtIndex(index int)  {
    if index<0 || index>= this.index {
        return 
    }
    prev:= this.dummy
    for i:=0; i<index;i++ {
        prev= prev.next
    }

    prev.next= prev.next.next
    this.index--

    
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Get(index);
 * obj.AddAtHead(val);
 * obj.AddAtTail(val);
 * obj.AddAtIndex(index,val);
 * obj.DeleteAtIndex(index);
 */