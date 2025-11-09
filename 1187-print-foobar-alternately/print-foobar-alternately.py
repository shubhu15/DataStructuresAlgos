class FooBar:
    def __init__(self, n):
        self.n = n

        self.foo_event = threading.Event()
        self.bar_event = threading.Event()
        self.foo_event.set()


    def foo(self, printFoo: 'Callable[[], None]') -> None:
        
        for i in range(self.n):
            self.foo_event.wait()
            printFoo()
            self.foo_event.clear()
            self.bar_event.set()
            # printFoo() outputs "foo". Do not change or remove this line.
        	

    def bar(self, printBar: 'Callable[[], None]') -> None:
        
        for i in range(self.n):
            self.bar_event.wait()
            printBar()
            self.bar_event.clear()
            self.foo_event.set()
            
            # printBar() outputs "bar". Do not change or remove this line.
            