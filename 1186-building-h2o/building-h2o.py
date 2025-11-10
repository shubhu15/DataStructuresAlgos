class H2O:
    def __init__(self): 
        self.sem_h = threading.Semaphore(2)
        self.sem_o = threading.Semaphore(1)
        self.bar_assembling = threading.Barrier(3)


    def hydrogen(self, releaseHydrogen: 'Callable[[], None]') -> None:

        with self.sem_h:
            self.bar_assembling.wait()

            releaseHydrogen()



    def oxygen(self, releaseOxygen: 'Callable[[], None]') -> None:

        with self.sem_o:
            self.bar_assembling.wait()

            releaseOxygen()