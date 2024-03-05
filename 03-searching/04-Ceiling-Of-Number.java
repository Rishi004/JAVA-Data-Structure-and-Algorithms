// Find the smallest element in an array that is greater than or equal to a specified target.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
  // Input: nums = [2, 3, 4, 9, 11, 16, 18], target = 15
  // Output: 4

// Example 2:
  // Input: nums = [1,3,5,6], target = 2
  // Output: 1
  
// Example 3:
  // Input: nums = [1,3,5,6], target = 7
  // Output: 4

package com.rishi.searching;

public class CeilNum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 9;
        System.out.println(findCeil(nums, target));
    }

    private static int findCeil(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
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
        return start;
    }
}
