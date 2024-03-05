// (34)
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
  // Input: nums = [5,7,7,8,8,10], target = 8
  // Output: [3,4]
  
// Example 2:
  // Input: nums = [5,7,7,8,8,10], target = 6
  // Output: [-1,-1]
  
// Example 3:
  // Input: nums = [], target = 0
  // Output: [-1,-1]

package com.rishi.searching;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] out = {-1, -1};
        out[0] = findInd(nums, target, true);

        if (out[0] != -1) {
            out[1] = findInd(nums, target, false);
        }

        return out;
    }

    static int findInd(int[] nums, int target, boolean isStart) {
        int start = 0;
        int end = nums.length - 1;
        int ind = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ind = mid;
                if (isStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ind;
    }
}
