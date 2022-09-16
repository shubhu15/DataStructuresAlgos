package Array;

import java.util.*;

public class test {

    public test(){

    }


    public static void main(String[] args) {
        test test = new test();
        p p1 =new p("f1", "l1");
        p p2 =new p("f2", "l2");
        Map<p,String>  mp = new HashMap<>();
        mp.put(p1, "www");
        mp.put(p2, "weeeww");
        mp.put(new p("f1","l1"), "mememe");
        System.out.println(mp.size());
        System.out.println(mp.get(new p("f1", "l1")));

        synchronized (args){
            System.out.println("2");
            try {
                args.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("4");
    }
}
class p{
    String fi;
    String ls;

    public p(String fi, String ls) {
        this.fi = fi;
        this.ls = ls;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getLs() {
        return ls;
    }

    public void setLs(String ls) {
        this.ls = ls;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        p p = (p) o;
//        return Objects.equals(fi, p.fi) && Objects.equals(ls, p.ls);
//    }

    @Override
    public int hashCode() {
        return 13;
    }
}
class q extends p{
    public q(String fi, String ls) {
        super(fi, ls);
    }
}