class Foo:
    def __init__(self):
        self.lock = threading.Lock()
        self.first_done = threading.Condition(self.lock)
        self.second_done = threading.Condition(self.lock)
        self._is_first_run= False
        self._is_second_run = False


    def first(self, printFirst: 'Callable[[], None]') -> None:
        
        # printFirst() outputs "first". Do not change or remove this line.
        with self.lock:
            printFirst()
            self._is_first_run = True
            self.first_done.notifyAll()
            


    def second(self, printSecond: 'Callable[[], None]') -> None:
        
        # printSecond() outputs "second". Do not change or remove this line.
        with self.lock:
            while not self._is_first_run:
                self.first_done.wait()
            printSecond()
            self._is_second_run = True
            self.second_done.notifyAll()


    def third(self, printThird: 'Callable[[], None]') -> None:
        
        # printThird() outputs "third". Do not change or remove this line.
        with self.lock:
            while not self._is_second_run:
                self.second_done.wait()
            printThird()
        