class Solution:
    def haveConflict(self, event1: List[str], event2: List[str]) -> bool:

        start_ev1 = event1[0].split(":")
        start_time1 = 60* start_ev1[0] +start_ev1[1]

        end_ev1 = event1[1].split(":")
        end_time1 = 60*end_ev1[0] + end_ev1[1]

        start_ev2 = event2[0].split(":")
        start_time2 = 60* start_ev2[0] +start_ev2[1]

        end_ev2 = event2[1].split(":")
        end_time2 = 60*end_ev2[0] + end_ev2[1]

        if start_time1 > start_time2:
            return self.haveConflict(event2, event1)

        if end_time1>= start_time2:
            return True
        return False
        