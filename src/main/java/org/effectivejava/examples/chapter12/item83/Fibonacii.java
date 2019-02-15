package org.effectivejava.examples.chapter12.item83;

/**
 * 菲波那契数列
 * @author zw
 * @date 2018/11/27
 */
public class Fibonacii {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(("菲波那契数列: " + fib(n)));
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
