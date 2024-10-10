// (645)
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, 
// one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// You may assume the returned array does not count as extra space.

// Example 1:
  // Input: nums = [1,2,2,4]
  // Output: [2,3]

// Example 2:
  // Input: nums = [1,1]
  // Output: [1,2]


package com.rishi.sorting;

import java.util.Arrays;

class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);

        int[] out = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                out[0] = nums[i];
                out[1] = i + 1;
            }
        }

        return out;
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

