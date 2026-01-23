type Node struct {
    key int
    val int
    next *Node
    prev *Node
}

type LRUCache struct {
    head *Node
    tail *Node
    cap int
    nodeMap map[int]*Node
    
}


func Constructor(capacity int) LRUCache {
    lru := LRUCache {
        head: &Node{key:-1,val: -1},
        tail: &Node{key: -1,val: -1},
        cap: capacity,
        nodeMap: make(map[int]*Node),
    }
    lru.head.next = lru.tail
    lru.tail.prev= lru.head
    return lru
    
}


func (this *LRUCache) Get(key int) int {
    v, ok:= this.nodeMap[key]
    if ok {
        this.removeNode(v)
        this.add_to_head(v)
        return v.val
    }
    return -1
    
}
func (this *LRUCache) removeNode(node *Node) {
    node.prev.next, node.next.prev = node.next, node.prev
}

func (this *LRUCache) add_to_head(node *Node) {
    node.next = this.head.next
    node.prev = this.head
    this.head.next.prev = node
    this.head.next = node
}


func (this *LRUCache) Put(key int, value int)  {
    v, ok :=this.nodeMap[key]
    if ok  {
        v.val = value
        this.removeNode(v)
        this.add_to_head(v)

    } else 
    {
        if len(this.nodeMap) >= this.cap {
            lru:=this.tail.prev
            
        delete(this.nodeMap, lru.key)
        this.removeNode(lru)
        
        }
        node:= &Node{key:key,val: value}
        this.add_to_head(node) 
        this.nodeMap[key]=node

    }

    
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * obj := Constructor(capacity);
 * param_1 := obj.Get(key);
 * obj.Put(key,value);
 */