type Logger struct {
    mapt map[string]int
}


func Constructor() Logger {
    return Logger {
        mapt: make(map[string]int),
    }
    
}


func (this *Logger) ShouldPrintMessage(timestamp int, message string) bool {
    v, ok:= this.mapt[message]
    if ok {
        if timestamp<v {
            return false
        }
        
    } 
        this.mapt[message] =timestamp+ 10
            
    
     
     return true
    
}


/**
 * Your Logger object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.ShouldPrintMessage(timestamp,message);
 */