package org.effectivejava.examples.chapter12.item84;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author zw
 * @date 2018/11/27
 */
public class SetExample {
    /**
     * hashSet
     */
    public static void hashSet() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        //1.for循环遍历
        for (int i = 0; i < set.size(); i++) {
            System.out.print("for循环元素: " + i);
        }
        for (String str : set) {
            System.out.print("for循环遍历: " + str);
        }
        //2.迭代遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print("迭代遍历: " + iterator.next());
        }
        //3.泛型
        for (Object obj : set) {
            if (obj instanceof String) {
                System.out.print("for泛型: " + (String) obj);
            }
        }
    }

    /**
     * treeSet
     */
    public static void treeSet() {
        String s1 = "01,02,03";
        String s2 = "01,03,04";
        String[] str = (s1 + "," + s2).split(",");
        Set<String> set = new TreeSet<>(Arrays.asList(str));
        Iterator<String> iterator = set.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next() + ",");
        }
        if (!"".equals(stringBuilder)) {
            System.out.print("treeSet: " + stringBuilder.substring(0, stringBuilder.length() - 1));
        }
    }

    public static void main(String[] args) {

//        SetExample.hashSet();

        SetExample.treeSet();
    }
}
