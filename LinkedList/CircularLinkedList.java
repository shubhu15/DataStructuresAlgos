package LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size=0;

    public CircularLinkedList(int size) {
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

    public void insertEnd(int val){

        Node newNode = new Node(val);

        if (head== null)
        {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next=newNode;
        newNode.next =head;
        tail = newNode;
    }

    public void display(){
        Node node = head;

        if(head!=null){

            do {
                System.out.println(node.value);
                node = node.next;
            }
            while (node!=head);
        }
    }

    public void delete(int value){
        Node node = head;

        if (node==null)
            return;

        // if head is to be deleted
        if(node.value == value)
        {
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node= node.next;
        }
        while (node!=head);
    }
}
