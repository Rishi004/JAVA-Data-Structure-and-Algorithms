// (1095)
// (This problem is an interactive problem.)
// You may recall that an array arr is a mountain array if and only if:
//   1. arr.length >= 3
//   2. There exists some i with 0 < i < arr.length - 1 such that:
//         1. arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//         2. arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr[index] == target. If such an index does not exist, return -1.
// You must solve it in O(log(arr.length)) time complexity.

// Example 1:
  // Input: array = [1,2,3,4,5,3,1], target = 3
  // Output: 2
  // Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
  
// Example 2:
  // Input: array = [0,1,2,4,2,1], target = 3
  // Output: -1
  // Explanation: 3 does not exist in the array, so we return -1.

package com.rishi.searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 2;
        System.out.println(findInMountainArray(target, mountainArr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakInd(mountainArr);
        int first = findFirst(mountainArr, target, 0, peak);

        if (first != -1) {
            return first;
        }
        return findLast(mountainArr, target, peak, mountainArr.length - 1);

    }

    static int findPeakInd(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int findFirst(int[] mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int findLast(int[] mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            } else if (mountainArr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
