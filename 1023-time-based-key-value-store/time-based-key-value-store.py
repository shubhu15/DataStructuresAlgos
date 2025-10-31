class TimeMap:

    def __init__(self):
        self.hmap1= defaultdict(list)
        

    def set(self, key: str, value: str, timestamp: int) -> None:
        
        self.hmap1[key].append([timestamp, value])
        
        

    def get(self, key: str, timestamp: int) -> str:

        t_new = self.hmap1[key]
        if not t_new:
            return ""
        i=0
        j= len(t_new)-1
        res=""
        while i<=j:
            mid = i + (j-i)//2
            if t_new[mid][0] <= timestamp:
                i=mid+1
                res=t_new[mid][1]
            else:
                j=mid-1

        return res

        


# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)