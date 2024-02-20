// Binary Search - O(logn)

package com.rishi.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 8, 23, 45, 67};
        int target = 4;
        System.out.println(binarySearch(nums, target));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
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
