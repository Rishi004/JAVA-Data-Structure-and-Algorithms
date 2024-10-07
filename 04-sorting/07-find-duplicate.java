// (287)
// (Asked in Amazon and Microsoft)
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space and runtime complexity O(n).

// Example 1:
  // Input: nums = [1,3,4,2,2]
  // Output: 2
  
// Example 2:
  // Input: nums = [3,1,3,4,2]
  // Output: 3
  
// Example 3:
  // Input: nums = [3,3,3,3,3]
  // Output: 3


package com.rishi.sorting;

class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                return nums[i];
            }
        }
        return -1;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;
            if (arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
