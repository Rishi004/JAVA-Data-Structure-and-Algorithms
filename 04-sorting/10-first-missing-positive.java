// (41)
// (Asked in Amazon)
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Example 1:
  // Input: nums = [1,2,0]
  // Output: 3
  // Explanation: The numbers in the range [1,2] are all in the array.
  
// Example 2:
  // Input: nums = [3,4,-1,1]
  // Output: 2
  // Explanation: 1 is in the array but 2 is missing.
  
// Example 3:
  // Input: nums = [7,8,9,11,12]
  // Output: 1
  // Explanation: The smallest positive integer 1 is missing.


// SOLUTION -> 01
package com.rishi.sorting;

import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i] - 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        int len = arr.length;
        while (i < len) {
            int correctInd = arr[i] - 1;
            if (correctInd < 0 || correctInd >= len || arr[i] == arr[correctInd]) {
                i++;
            } else {
                swap(arr, i, correctInd);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}


// SOLUTION -> 02
package com.rishi.sorting;

public class FirstMissingPositive2 {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive2(nums));
    }

    static int firstMissingPositive2(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];

        for (int num : nums) {
            if (num >= 1 && num <= nums.length) {
                arr[num - 1] = num;
            }
        }

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                return i + 1;
            }
        }

        return len + 1;
    }
}



