package me.ggulmool.data.list;

import java.util.Iterator;

/**
 * Created by ggulmool on 2016-09-30.
 */
public class MyVectorTest {
    public static void main(String[] args) {
        MyVector v = new MyVector();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : " + v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("삭제 후 : " + v);
    }
}
