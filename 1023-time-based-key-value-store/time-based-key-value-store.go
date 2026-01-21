type TimeMap struct {

    store map[string][]Data  
}

type Data struct {
    timestamp int
    val string
}


func Constructor() TimeMap {
    store:= TimeMap {
        store: make(map[string][]Data),
    }   
    return store
    
}


func (this *TimeMap) Set(key string, value string, timestamp int)  {
    storeval:= Data {
        timestamp: timestamp,
        val: value,
    }
    this.store[key] = append(this.store[key], storeval)
    
}


func (this *TimeMap) Get(key string, timestamp int) string {
    if v,ok:=this.store[key]; ok {
        i:=0
        j:= len(v)-1
        res:=""
        for i<=j {
            mid := i + (j-i)/2
            storeval := v[mid].val
            time := v[mid].timestamp
            if time<= timestamp {
                res = storeval
                i= mid+1
            } else {
                j=mid-1
            }
        }
        return res


    } else {
        return ""
    }
    
}


/**
 * Your TimeMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Set(key,value,timestamp);
 * param_2 := obj.Get(key,timestamp);
 */