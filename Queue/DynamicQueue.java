package Queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int data){
        if(isFull()){
            int[] temp = new int[arr.length *2];

//            copy all the previous data to this temp
            for(int i=0;i<arr.length;i++)  // can use Arrays.copyData method
                temp[i] = arr[(front+i)% arr.length];  // CHANGE HERE!!

            front=0;
            end= arr.length;
            arr = temp;
        }


        return super.insert(data);
    }
}
