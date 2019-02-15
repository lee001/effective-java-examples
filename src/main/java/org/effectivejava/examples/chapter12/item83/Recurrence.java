package org.effectivejava.examples.chapter12.item83;

/**
 * 求5的阶乘
 *
 * @author zw
 * @date 2018/11/27
 */
public class Recurrence {
    public static void main(String[] args) {
        int n = 5;
        n = n * fun(n - 1);
        System.out.println(("5的阶乘: {}" + n));
    }

    private static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fun(n - 1);
    }
}
