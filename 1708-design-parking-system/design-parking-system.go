type ParkingSystem struct {
    currCount []int
    maxCap []int
    
}


func Constructor(big int, medium int, small int) ParkingSystem {
    return ParkingSystem {
        currCount: make([]int, 3),
        maxCap: []int{big, medium, small},

    }
    
}


func (this *ParkingSystem) AddCar(carType int) bool {
    maxc := this.maxCap[carType-1]
    currC:=this.currCount[carType-1]
    if currC<maxc {
        this.currCount[carType-1]++
        return true
    }
    return false
    
}


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * obj := Constructor(big, medium, small);
 * param_1 := obj.AddCar(carType);
 */