import threading

class DiningPhilosophers:

    def __init__(self):
        self.lock = [ threading.Semaphore(1) for _ in range(5)]
        self.sema = threading.Semaphore(4)

    # call the functions directly to execute, for example, eat()
    def wantsToEat(self,
                   philosopher: int,
                   pickLeftFork: 'Callable[[], None]',
                   pickRightFork: 'Callable[[], None]',
                   eat: 'Callable[[], None]',
                   putLeftFork: 'Callable[[], None]',
                   putRightFork: 'Callable[[], None]') -> None:

                #    with self.sema:
                l= philosopher
                r= (philosopher +1) % 5
                self.lock[l].acquire()
                self.lock[r].acquire()
                pickLeftFork()
                pickRightFork()
                eat()
                putLeftFork()
                putRightFork()
                self.lock[l].release()
                self.lock[r].release()
                    


        



        