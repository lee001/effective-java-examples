package org.effectivejava.examples.chapter12.item83;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Star {
    public static void main(String[] args) {
        for (int row = 1; row <= 6; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 11; col >= 2 * row - 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
