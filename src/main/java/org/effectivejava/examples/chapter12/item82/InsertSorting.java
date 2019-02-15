package org.effectivejava.examples.chapter12.item82;

import java.util.Calendar;

/**
 * 插入排序：
 *
 * @author zw
 * @date 2018/11/27
 */
public class InsertSorting {
    public static void main(String[] args) {
        //让程序随机产生8个数
        int len = 88000;
        int a[] = new int[len];
        for (int i = 0; i < len; i++) {
            int t = (int) (Math.random() * 10000);
            a[i] = t;
        }

        Calendar cal = Calendar.getInstance();
        System.out.println("排序前：" + cal.getTime());

        Insert insert = new Insert();
        insert.sort(a);

        cal = Calendar.getInstance();
        System.out.println("排序后：" + cal.getTime());

        //for (int i = 0; i < a.length; i++) {
        //System.out.print(a[i]+" ");
        //}
    }
}
