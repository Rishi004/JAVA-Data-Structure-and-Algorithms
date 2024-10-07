// (448)
// (Asked in Google)
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// You may assume the returned list does not count as extra space.
  
// Example 1:
  // Input: nums = [4,3,2,7,8,2,3,1]
  // Output: [5,6]
  
// Example 2:
  // Input: nums = [1,1]
  // Output: [2]


package com.rishi.sorting;

import java.util.ArrayList;
import java.util.List;

class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    private static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
