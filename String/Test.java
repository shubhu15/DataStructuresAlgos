package String;

import java.util.Arrays;
import java.util.HashMap;

class A{}
class D extends A{}
class L extends D{}

public class Test {
    static void pr(A a){
        System.out.println("o");
    }

    static void pr(D a){
        System.out.println("t");
    }
    static void pr(Object a){
        System.out.println("rd");
    }

    public static void main(String[] args) {
        L c = new L();
        pr(c);
//int i =10/0;
        String s = "hello ";
        s += "world";
        String s2 = "hello ";
        s2 += "world";
        String s3 = s.intern();
        String s4 = s2.intern();
        Boolean bi = s3==s4;
        bi = s3.equals(s4);
        X[] vv = X.values();
        System.out.println(vv[1]);

        HashMap<String , String > hm = new HashMap<>();
        hm.put(new String("hh"), "hh");
        System.out.println(hm.get(new String("hh")));

        System.out.println(Arrays.stream(new int[]{1,2,3,4,5}).filter(i-> i%2==0)
                .map(operand -> operand*2).sum());

    }

    enum X{
        q,w,e,r;
    }

}
