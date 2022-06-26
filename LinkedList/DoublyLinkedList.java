package LinkedList;

public class DoublyLinkedList {

    private Node head;
    private int size=0;

    public DoublyLinkedList(int size) {
        this.size = size;
    }

    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next =head;
        node.prev = null;
        if(head!=null)
        head.prev =node;

        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;


        if(head == null)
        {
            //edge case if ll is empty
            node.prev = null;
            head =node;
            return;
        }

        while (last.next!= null ){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

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
    public void insertAfterValue(int value, int val){
        Node node = find(value);
        if(node== null)
        {
            System.out.println("value not exists");
            return;
        }

        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        if(node.next!=null)
            node.next.prev = newNode;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.println(temp.value +" -> ");
            last = temp;
            temp = temp.next;
        }

//        print in the reverse
        while (last!=null){
            System.out.println(last.value);
            last = last.prev;
        }
    }

}
