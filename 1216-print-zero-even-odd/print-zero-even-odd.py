import threading

class ZeroEvenOdd:
    def __init__(self, n):
        self.n = n
        self.eventz = threading.Event()
        self.evente = threading.Event()
        self.evento = threading.Event()
        self.eventz.set()
        
        
	# printNumber(x) outputs "x", where x is an integer.
    def zero(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(1, self.n+1):
            self.eventz.wait()
            if i%2==1:
                printNumber(0)
                self.evento.set()
            else:
                printNumber(0)
                self.evente.set()
            
            self.eventz.clear()

        
        
        
    def even(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(1, self.n +1):
            
            if i%2==0:
                self.evente.wait()
                printNumber(i)
                self.eventz.set()
                self.evente.clear()
        
        
        
    def odd(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(1, self.n +1):
            
            if i%2==1:
                self.evento.wait()
                printNumber(i)
                self.eventz.set()
                self.evento.clear()

        
        