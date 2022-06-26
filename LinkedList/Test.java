package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Test {
    static {
        System.out.println("paren");
    }
    {
        System.out.println("pa ini");
    }

    public Test(){
        System.out.println("pa cons");
    }
}

class Child extends Test {
    static {
        System.out.println("child");
    }
    {
        System.out.println(" ch ini");
    }

    public Child(){
        System.out.println(" ch cons");
    }
}
class Person{
    private String fs;
    private  String ls ;

    public Person(String fs, String ls) {
        this.fs = fs;
        this.ls = ls;
    }
}
class Main{
    public static void main(String[] args) {
        Child c = new Child();
        Person p1 = new Person("fs","ls");
        Person p2 = new Person("fs","ls");
        List ls = new ArrayList();
        Set s = new HashSet();

        ls.add(p1);
        ls.add(p2);

        s.add(p1);
        s.add(p2);

        System.out.println("ls "+ls.size() +"s"+s.size());
    }

    void waitfor() throws InterruptedException {
        Object ob = new Object();
        synchronized (Thread.currentThread()){
            ob.wait();
            ob.notify();
        }
    }


}

class MyAdd<T>{

    void add(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        MyAdd<Number> ns = new MyAdd<>();
        ns.add(new Integer(1));
        ns.add(new Double(1.0));
    }
}


class TestSeven extends Thread{

    private static int x;
    public synchronized void dothings(){
        int c =x;
        c++;
        x =c;

    }

    public void run(){
        dothings();
    }

}