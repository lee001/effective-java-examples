package org.effectivejava.examples.chapter12.item82;

import java.util.Calendar;

/**
 * 冒泡排序法:从后向前或从前向后依次比较排序
 * @author zw
 * @date 2018/11/27
 */
public class BubbleSorting {
    public static void main(String[] args) {
        //int a1[] = {1,-1,2,8,3};
        int len = 80000;
        int[] a1 = new int[len];
        for (int i = 0; i < len; i++) {
            int t = (int) (Math.random() * 10000);
            a1[i] = t;
        }
        Calendar cal = Calendar.getInstance();
        System.out.println("排序前：" + cal.getTime());

        Bubble bubble = new Bubble();
        //编译器立即开辟了一个新栈——>引用传递
        bubble.sort(a1);

        cal = Calendar.getInstance();
        System.out.println("排序后：" + cal.getTime());

        //不是数组或对象(复合数据类型)，而只是一个简单的数据类型,不会调用引用传递
        int a = 12;
        bubble.test(a);
        System.out.println("a=" + a);

        //for (int i = 0; i < a1.length; i++) {
        //System.out.print(a1[i]+" ");
        //}
    }
}
