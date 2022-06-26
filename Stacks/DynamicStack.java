package Stacks;

public class DynamicStack extends CustomStack{

    DynamicStack(){
        super();
    }

    DynamicStack(int size){
        super(size);
    }

    // all methods will be same, except the push method as it will increase the size of the array,
//     so override the push method

    @Override
    public boolean push(int data){
        if(isFull()){
            int[] temp = new int[arr.length *2];

//            copy all the previous data to this temp
            for(int i=0;i<arr.length;i++)  // can use Arrays.copyData method
                temp[i] = arr[i];
            arr = temp;
        }
//        pointer++;
//        arr[pointer] = data;
//        return true;

        return super.push(data);

    }
}
