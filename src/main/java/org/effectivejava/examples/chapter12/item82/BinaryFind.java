package org.effectivejava.examples.chapter12.item82;

/**
 * 二分查找
 *
 * @author zw
 * @date 2018/11/27
 */
public class BinaryFind {
    public void find(int leftIndex, int rightIndex, int val, int arr[]) {
        //首先找到中间数
        int midIndex = (leftIndex + rightIndex) / 2;
        int midVal = arr[midIndex];
        if (rightIndex >= leftIndex) {
            if (midVal > val) {
                //在arr左边数中找
                find(leftIndex, midIndex - 1, val, arr);
            } else if (midVal < val) {
                //在arr右边数中找
                find(midIndex + 1, rightIndex, val, arr);
            } else if (midVal == val) {
                System.out.println("找到下标:" + midIndex);
                return;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 12, 25};
        BinaryFind bf = new BinaryFind();
        bf.find(0, arr.length - 1, 5, arr);
    }
}
