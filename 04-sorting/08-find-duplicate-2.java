// (442)
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

// Example 1:
  // Input: nums = [4,3,2,7,8,2,3,1]
  // Output: [2,3]
  
// Example 2:
  // Input: nums = [1,1,2]
  // Output: [1]
  
// Example 3:
  // Input: nums = [1]
  // Output: []


package com.rishi.sorting;

import java.util.ArrayList;
import java.util.List;

class FindDuplicate2 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                list.add(nums[i]);
            }
        }

        return list;
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
