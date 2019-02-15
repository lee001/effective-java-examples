package org.effectivejava.examples.chapter12.item82;

import java.util.Calendar;

/**
 * 快速排序法:先找到一个数作为中间的数，和两边的数比较
 * 特点：排序最快，占cpu内存最大
 *
 * @author zw
 * @date 2018/11/27
 */
public class QuickSorting {
    public static void main(String[] args) {

        int len = 8;
        int a[] = new int[8];
        for (int i = 0; i < len; i++) {
            int t = (int) (Math.random() * 10000);
            a[i] = t;
        }

        Calendar cal = Calendar.getInstance();
        System.out.println("排序前：" + cal.getTime());

        Quick quick = new Quick();
        quick.sort(0, a.length - 1, a);

        cal = Calendar.getInstance();
        System.out.println("排序后：" + cal.getTime());

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
