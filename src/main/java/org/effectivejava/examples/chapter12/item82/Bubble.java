package org.effectivejava.examples.chapter12.item82;

/**
 * @author zw
 * @date 2018/11/27
 */
final class Bubble {
    public void sort(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void test(int a) {
        a++;
    }
}
