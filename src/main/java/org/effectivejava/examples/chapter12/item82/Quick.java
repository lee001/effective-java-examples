package org.effectivejava.examples.chapter12.item82;

/**
 * @author zw
 * @date 2018/11/27
 */
public class Quick {
    public void sort(int left, int right, int[] array) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;
        while (l < r) {
            while (array[l] < pivot) {
                l++;
            }
            while (array[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            if (array[l] == pivot) {
                --r;
            }
            if (array[r] == pivot) {
                ++l;
            }

        }

        if (l == r) {
            l++;
            r--;
        }

        if (left < r) {
            sort(left, r, array);
        }
        if (right > l) {
            sort(l, right, array);
        }

    }
}
