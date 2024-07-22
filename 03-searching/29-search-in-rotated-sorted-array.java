// (33)
// There is an integer array nums sorted in ascending order (with distinct values).
  
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
  // Input: nums = [4,5,6,7,0,1,2], target = 0
  // Output: 4
  
// Example 2:
  // Input: nums = [4,5,6,7,0,1,2], target = 3
  // Output: -1
  
// Example 3:
  // Input: nums = [1], target = 0
  // Output: -1


package com.rishi.searching;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 0, 1, 2};
        int target = 1;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return findInd(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (nums[0] <= target) {
            return findInd(nums, target, 0, pivot - 1);
        }
        return findInd(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findInd(int[] nums, int target, int start, int end) {
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
