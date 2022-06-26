package LinkedList;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size=0;

    public CustomLinkedList(int size) {
        this.size = size;
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null)
            tail = head;

        size++;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        tail.next =newNode;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int val, int index){

        if(index==0)
        {
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        /*int count=0;
        while (temp!=null){
            if(count== index-1)
                break;
            temp=temp.next;
        }*/

        for(int i =1; i<index;i++)
            temp=temp.next;

        Node newNode = new Node(val); // Node newNode = new Node(val, temp.next)
        newNode.next = temp.next;
        temp.next = newNode;

    }

//    insert using recursion

    public void insertRecursion(int val, int index){

        head = helperInsertRecursion(val, index, head);
    }

    private Node helperInsertRecursion(int val, int index, Node node) {

        if(index ==0){
            Node newNode = new Node(val,node);
            newNode.next = node;
            size++;
            return newNode;
        }

        node.next = helperInsertRecursion(val,index-1, node.next);
        return node;
    }


    public int deleteFirst(){

        int val = head.value;
        head = head.next;

        if(head==null)
            tail= null;

        size--;

        return val;
    }

    public int deleteLast(){

        if(size<=1)
            deleteFirst();

        Node secondLastNode = get(size);
        int value = tail.value;
        tail = secondLastNode;
        tail.next = null;
        size--;
        return value;
    }
    public Node find(int value){
        Node n = head;
        while (n !=null){
            if(n.value == value)
                return n;
            n = n.next;
        }
        return n;

    }
    public Node get(int index){
        Node temp = head;
        for(int i =0; i<index; i++)
            temp =temp.next;
        return temp;
    }

    public int deleteAtIndex(int index){

        if(index ==0){
            return deleteFirst();
        }
        if(index == size)
            return deleteLast();

        Node prev = get(index); // doubt check code
        int v = prev.next.value;
        prev.next = prev.next.next;
        return v;

    }

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.println(temp.value+"->");
            temp =temp.next;
        }
    }
}
