package org.effectivejava.examples.chapter12.item82;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Select {
    //引用传递
    public void sort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //定义第一个数就是最小值
            int min = arr[i];
            //记录最小数的下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    //修改最小
                    min = arr[j];
                    minIndex = j;
                }
            }

            //当退出for就找到这次的最小值
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
