// (41)
// Given an unsorted integer array nums, return the smallest missing positive integer.
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

package com.rishi;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        for (int num : nums) {
            if (num > n || num <= 0) {
                continue;
            } else {
                out[num - 1] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (out[i] == 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
