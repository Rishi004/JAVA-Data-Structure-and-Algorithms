// Runtime complexity:
  // best - O(n²)
  // worst - O(n²)


package com.rishi.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, last);
            swap(arr, last, maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int last, int maxIndex) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int findMaxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
