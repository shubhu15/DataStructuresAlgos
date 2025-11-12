class MyCalendar:

    def __init__(self):
        self.calendar=[]
        

    def book(self, startTime: int, endTime: int) -> bool:
        if not self.calendar:
            self.calendar.append([startTime, endTime])
            return True
        else:
     
            for s,e in self.calendar:
                if not (e<= startTime or s>= endTime):
                    return False

            
            self.calendar.append([startTime, endTime])
        return True
                

                    
        


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(startTime,endTime)