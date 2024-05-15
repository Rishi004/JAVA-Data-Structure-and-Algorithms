// (1608)
// You are given an array nums of non-negative integers.
// nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
  
// Notice that x does not have to be an element in nums.

// Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.

// Example 1:
  // Input: nums = [3,5]
  // Output: 2
  // Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
  
// Example 2:
  // Input: nums = [0,0]
  // Output: -1
  // Explanation: No numbers fit the criteria for x.
  // If x = 0, there should be 0 numbers >= x, but there are 2.
  // If x = 1, there should be 1 number >= x, but there are 0.
  // If x = 2, there should be 2 numbers >= x, but there are 0.
  // x cannot be greater since there are only 2 numbers in nums.
  
// Example 3:
  // Input: nums = [0,4,3,0,4]
  // Output: 3
  // Explanation: There are 3 values that are greater than or equal to 3.


package com.rishi.searching;

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0, 4};
        System.out.println(specialArray(nums));
    }

    static int specialArray(int[] nums) {
        int len = nums.length;
        int[] count = new int[len + 1];

        for (int num : nums) {
            if (num >= len) {
                count[len]++;
            } else {
                count[num]++;
            }
        }

        int res = 0;
        for (int i = count.length - 1; i > 0; i--) {
            res += count[i];
            if (res == i) {
                return res;
            }
        }

        return -1;
    }
}
