package Stacks.Medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache1 {
//    https://www.geeksforgeeks.org/lru-cache-implementation/

    // USING LINKED_HASHMAP -> BUT SHOULD NOT TOLD INTERVIEWS
    Map<Integer, Integer> cache ;
    int capacity;

    public LRUCache1(int capacity) {
        this.cache = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        int value = cache.get(key);
        cache.remove(key);
        cache.put(key, value);
        return value;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key))
        {               cache.remove(key);
            cache.put(key, value);
            return ;}
        if(cache.size() >= capacity){
            Map.Entry<Integer, Integer> firstKey = cache.entrySet().iterator().next();
            cache.remove(firstKey.getKey());
        }
        cache.put(key, value);
    }
}
class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;
    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    public void set(int key, int value) {
        map.put(key, value);
    }
}

class LRUCache_IMP {

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer, Node> hm = new HashMap<>();
    int capacity;

    public LRUCache_IMP(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!hm.containsKey(key))
            return -1;
        Node value = hm.get(key);
        remove(value);
        insert(value);
        return value.val;
    }

    public void put(int key, int value) {
        if(hm.containsKey(key))
            remove(hm.get(key));

        if(hm.size() == capacity){

            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    void remove(Node n){

        hm.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    void insert(Node n){
        hm.put(n.key, n);
        Node headNext = head.next;
        n.next = headNext;
        n.prev = head;
        head.next = n;
        headNext.prev =n;
    }
}

class Node{

    Node prev, next;
    int key,val;
    Node(int key,int val){
        this.val = val;
        this.key = key;
    }
}
