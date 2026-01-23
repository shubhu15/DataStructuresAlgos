type HitCounter struct {
    hits []int
    time []int
    
}


func Constructor() HitCounter {
    return HitCounter {
        hits: make([]int, 300),
        time: make([]int, 300),
    }
    
}


func (this *HitCounter) Hit(timestamp int)  {
    ind := timestamp % 300
    if this.time[ind] != timestamp {
        this.time[ind]=timestamp
        this.hits[ind]=1
    } else {
        this.hits[ind]++
    }
    
}


func (this *HitCounter) GetHits(timestamp int) int {
    total:=0

    for i:=0;i<300;i++ {
        if timestamp - this.time[i] <300 {
            total += this.hits[i]
        }

    }
    return total
    
}


/**
 * Your HitCounter object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Hit(timestamp);
 * param_2 := obj.GetHits(timestamp);
 */