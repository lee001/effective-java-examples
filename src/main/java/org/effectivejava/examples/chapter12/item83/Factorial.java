package org.effectivejava.examples.chapter12.item83;

import java.util.Scanner;

/**
 * n的阶乘和
 * @author zw
 * @date 2018/11/27
 */
public class Factorial {
    public static void main(String[] args) {
        int n, temp = 1;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(("请输入一个数："));
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            temp *= i;
            sum += temp;
        }
        System.out.println(("这个数的阶乘之和为：" + sum));
    }
}
