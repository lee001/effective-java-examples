package org.effectivejava.examples.chapter12.item84;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zw
 * @date 2018/11/27
 */
public class MapExample {
    /**
     * hashMap
     */
    public static void hashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("c", "c");
        map.put("c", "c");
        map.put(null, null);
        //1.
        System.out.print("【For循环遍历----------------】");
        for (int i = 0; i < map.size(); i++) {
            System.out.print("hashMap For循环遍历: " + map.get(i));
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            System.out.print("hashMap keySet key: " + str + ",  value: " + map.get(str));
        }
        //2.
        System.out.print("【iterator遍历----------------】");
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.print("hashMap entry key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        //3.大数据容量推荐
        System.out.print("【大数据容量推荐】----------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print("hashMap mapEntry key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        //4.只能遍历value值
        System.out.print("【只能遍历value值】---------------");
        for (String val : map.values()) {
            System.out.print("hashMap val: " + val);
        }
    }

    /**
     * hashTable
     */
    public static void hashTable() {
        Map<String, String> map = new Hashtable<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "c");
//        map.put("d", null);
        //1.
        for (int i = 0; i < map.size(); i++) {
            System.out.print("hashTable For循环遍历: " + map.get(i));
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            System.out.print("hashTable keySet key: " + str + ", value: " + map.get(str));
        }
        //2.
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.print("hashTable entry key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        //3.大数据容量推荐
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print("hashTable mapEntry key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        //4.只能遍历value值
        for (String val : map.values()) {
            System.out.print("hashTable val: " + val);
        }
    }

    public static void main(String[] args) {
        MapExample.hashMap();

        //MapExample.hashTable();
    }
}
