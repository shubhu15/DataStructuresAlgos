class Node:
    def __init__(self, val, key):
        self.key = key
        self.val= val
        self.prev=None
        self.next=None


class LRUCache:

    def __init__(self, capacity: int):
        self.cap = capacity
        self.cache_map ={}
        self.head =Node(0,0)
        self.tail =Node(0,0)
        self.head.next = self.tail
        self.tail.prev = self.head

    def _remove(self, node):
        prev, next = node.prev, node.next
        prev.next = next
        next.prev = prev
    def _insert(self,newnode):
        prev = self.tail.prev
        prev.next = newnode
        newnode.prev = prev
        self.tail.prev = newnode
        newnode.next = self.tail
        

    def get(self, key: int) -> int:
        if key in self.cache_map:
            node = self.cache_map[key]
            self._remove(node)
            newnode = Node(node.val, node.key)
            self._insert(newnode)
            self.cache_map[key]=newnode
            return newnode.val
        else:
            return -1
        
        

    def put(self, key: int, value: int) -> None:
        if key in self.cache_map:
            node = self.cache_map[key]
            self._remove(node)
            newnode = Node(value, key)
            self._insert(newnode)
            self.cache_map[key]=newnode
        else:
            newnode = Node(value,key)
            self._insert(newnode)
            self.cache_map[key]=newnode
            
        if len(self.cache_map) > self.cap:
            last_used = self.head.next
            self._remove(last_used)
            del self.cache_map[last_used.key]
            


        


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)