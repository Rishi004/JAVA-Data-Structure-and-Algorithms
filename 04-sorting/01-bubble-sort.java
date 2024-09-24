// Runtime complexity:
  // best - O(n)
  // worst - O(n²)


package com.rishi.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 1, l = arr.length - 1; i <= arr.length - 1; i++, l--) {
            boolean swapped = false;

            for (int j = 1; j <= l; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
