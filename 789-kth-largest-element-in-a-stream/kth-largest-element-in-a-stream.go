
import (
    "container/heap"
)

// IntHeap is a min-heap of ints.
type IntHeap []int

func (h IntHeap) Len() int           { return len(h) }
func (h IntHeap) Less(i, j int) bool { return h[i] < h[j] } // min-heap
func (h IntHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *IntHeap) Push(x any) {
    *h = append(*h, x.(int))
}

func (h *IntHeap) Pop() any {
    old := *h
    n := len(old)
    x := old[n-1]
    *h = old[:n-1]
    return x
}


type KthLargest struct {
    k int
    pq *IntHeap
    
}


func Constructor(k int, nums []int) KthLargest {
    h:= &IntHeap{}
    heap.Init(h)

    k1 := KthLargest {
        k: k,
        pq: h,
    }

    for _,v:=range nums{
        k1.Add(v)
    }
    return k1
    
}


func (this *KthLargest) Add(val int) int {
     heap.Push(this.pq, val)
    if this.pq.Len() > this.k {
        heap.Pop(this.pq)
    }
    return (*this.pq)[0]

    
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * obj := Constructor(k, nums);
 * param_1 := obj.Add(val);
 */