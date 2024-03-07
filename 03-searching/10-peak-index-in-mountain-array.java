// (852)
// An array arr is a mountain if the following properties hold:
  // 1. arr.length >= 3
  // 2. There exists some i with 0 < i < arr.length - 1 such that:
        // 1. arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
        // 2. arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
// You must solve it in O(log(arr.length)) time complexity.

// Example 1:
  // Input: arr = [0,1,0]
  // Output: 1
  
// Example 2:
  // Input: arr = [0,2,1,0]
  // Output: 1
  
// Example 3:
  // Input: arr = [0,10,5,2]
  // Output: 1

package com.rishi.searching;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
