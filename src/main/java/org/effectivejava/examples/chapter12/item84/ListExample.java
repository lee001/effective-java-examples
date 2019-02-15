package org.effectivejava.examples.chapter12.item84;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * arrayList是异步的，非线程安全的。
 * vector是同步的，线程安全的。
 * @author zw
 * @date 2018/11/27
 */
public class ListExample {
    /**
     * ArrayList
     */
    public static void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        //1.
        for (int i = 0; i < list.size(); i++) {
            System.out.print("arrayList循环遍历: " + list.get(i));
        }
        //2.
        for (String str : list) {
            System.out.print("arrayList: " + str);
        }
        //3.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print("arrayList迭代器: " + iterator.next());
        }
    }

    /**
     * LinkedList
     */
    public static void linkedList() {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        //1.
        for (int i = 0; i < list.size(); i++) {
            System.out.print("linkedList循环遍历: " + list.get(i));
        }
        //2.
        for (String str : list) {
            System.out.print("linkedList: " + str);
        }
        //3.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print("linkedList迭代器: " + iterator.next());
        }
    }

    /**
     * Vector
     */
    public static void vector() {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        //1.
        for (int i = 0; i < vector.size(); i++) {
            System.out.print("vector循环遍历: " + vector.get(i));
        }
        //2.
        for (String str : vector) {
            System.out.print("vector: " + str);
        }
        //3.
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print("vector迭代器: " + iterator.next());
        }

    }

    public static void main(String[] args) {
        ListExample.arrayList();

        ListExample.linkedList();

        ListExample.vector();
    }
}
