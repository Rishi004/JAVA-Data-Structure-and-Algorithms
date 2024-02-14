// (75)
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
  // Input: nums = [2,0,2,1,1,0]
  // Output: [0,0,1,1,2,2]

// Example 2:
  // Input: nums = [2,0,1]
  // Output: [0,1,2]

package com.rishi;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    static void sortColors(int[] nums) {
        int[] numerous = new int[3];
        for (int num : nums) {
            numerous[num]++;
        }

        int i = 0;
        for (int j = 0; j < 3; j++) {
            while (numerous[j] > 0) {
                nums[i] = j;
                numerous[j]--;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
