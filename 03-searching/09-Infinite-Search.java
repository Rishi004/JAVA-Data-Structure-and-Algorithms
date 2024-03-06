// Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
// Source: Amazon Interview Experience.
// You must write an algorithm with O(log n) runtime complexity.

package com.rishi.searching;

public class InfiniteSearch {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 8, 12, 15, 35, 46,
                47, 48, 56, 57, 58, 67, 71, 72, 75, 77,
                78, 79, 80, 84, 89, 90, 92, 93, 95, 100};
        int target = 90;
        System.out.println(infiniteSearch(nums, target));
    }

    static int infiniteSearch(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (nums[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
