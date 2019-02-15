package org.effectivejava.examples.chapter12.item82;

/**
 * 冒泡排序
 * @author zw
 * @date 2018/11/27
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] score = {67, 69, 75, 89, 23, 84, 75, 41};

        //最多做n-1趟排序
        for (int i = 0; i < score.length - 1; i++) {
            //对当前无序区间score[0...length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
            for (int j = 0; j < score.length - i - 1; j++) {
                //把小的值交换到后面
                if (score[j] < score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }

            System.out.println("第" + (i + 1) + "次排序结果:");
            for (int a = 0; a < score.length; a++) {
                System.out.print(score[a] + "\t");
            }
            System.out.println();
        }

        System.out.println("最终排序结果:");
        for (int a = 0; a < score.length; a++) {
            System.out.print(score[a] + "\t");
        }
    }
}
