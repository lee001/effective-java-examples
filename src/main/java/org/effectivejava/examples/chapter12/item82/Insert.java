package org.effectivejava.examples.chapter12.item82;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Insert {
    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            //insert准备和前一个数比较
            int index = i - 1;
            while (index >= 0 && insertVal < arr[index]) {
                //将把arr[index]向后移动
                arr[index + 1] = arr[index];
                index--;
            }

            //将insertVal插入到适当的位置
            arr[index + 1] = insertVal;
        }
    }
}
