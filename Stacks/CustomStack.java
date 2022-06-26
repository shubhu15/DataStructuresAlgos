package Stacks;

public class CustomStack{
    protected int[] arr;
    private static final int DEFAULT_SIZE =10;

    int pointer =-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.arr = new int[size];
    }

    public boolean push(int data){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        pointer++;
        arr[pointer] = data;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Stack is empty!");
        }

//        int data = arr[pointer];
//        pointer--;
//        return data;
        return arr[pointer--];
    }

    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Cannot peek from empty stack");
        return arr[pointer];
    }

    public boolean isFull() {
        return pointer == arr.length-1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }
}
