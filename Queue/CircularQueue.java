package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularQueue {

    protected int[] arr;
    private static final int DEFAULT_SIZE =10;

    int front =0;
    int end =0;
    private int size =0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.arr = new int[size];
    }
    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int data){
        if(isFull())
            return false;

        arr[end++] = data;
        end =end% arr.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is empty!!");

       int removed = arr[front++];
       front = front% arr.length;
       size--;
       return removed;
    }

    public int front() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");

        return arr[front];
    }

    public void display(){

        if(isEmpty())
        {
            System.out.println("EMPTY");
            return;
        }

        int i = front;
        do{
            System.out.println(arr[i]+"<-");
            i++;
            i = i% arr.length;
        }
        while (i!=end);
    }
}
