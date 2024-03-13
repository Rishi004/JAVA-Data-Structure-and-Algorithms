// Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right rotated 
// (i.e, the last element will be cyclically shifted to the starting position of the array) k number of times, the task is to find the value of k.
// You must write an algorithm with O(log n) runtime complexity.
  
// Example 1:
  // Input: arr[] = {15, 18, 2, 3, 6, 12}
  // Output: 2
  // Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. 
  // We get the given array after rotating the initial array twice.

// Example 2:
  // Input: arr[] = {7, 9, 11, 12, 5}
  // Output: 4
  // Explanation: Initial array must be {5, 7, 9, 11, 12}. 

// Example 3:
  // Input: arr[] = {7, 9, 11, 12}
  // Output: 0

package com.rishi.searching;

public class FindRotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
        System.out.println(findCount(nums));
    }

    static int findCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
