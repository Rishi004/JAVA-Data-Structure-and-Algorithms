// Runtime complexity:
  // best - O(n)
  // worst - O(n²)


package com.rishi.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int last, int maxIndex) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }


}
