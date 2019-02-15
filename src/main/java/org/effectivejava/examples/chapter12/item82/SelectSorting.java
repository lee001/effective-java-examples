package org.effectivejava.examples.chapter12.item82;

import java.util.Calendar;

/**
 * 选择排序：先找到最小值，让最小值和第一个交换，依次
 * @author zw
 * @date 2018/11/27
 */
public class SelectSorting {
    public static void main(String[] args) {
        //int a1[] = {1,-1,2,8,3};
        //让程序随机产生8个数
        int len = 8;
        int[] a1 = new int[len];
        for (int i = 0; i < len; i++) {
            //让程序随机产生一个数
            //Math.random();会产生一个0~1的数
            int t = (int) (Math.random() * 10000);
            a1[i] = t;
        }

        //在排序前打印系统时间
        Calendar cal = Calendar.getInstance();
        System.out.println("排序前：" + cal.getTime());

        Select select = new Select();
        //调用引用复合数据类型
        select.sort(a1);

        //重新得到实例
        cal = Calendar.getInstance();
        System.out.println("排序后：" + cal.getTime());

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }
}
