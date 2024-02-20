// (1250)
// Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers.
// The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.
// Return True if the array is good otherwise return False.

// Example 1:
  // Input: nums = [12,5,7,23]
  // Output: true
  // Explanation: Pick numbers 5 and 7.
  // 5*3 + 7*(-2) = 1
  
// Example 2:
  // Input: nums = [29,6,10]
  // Output: true
  // Explanation: Pick numbers 29, 6 and 10.
  // 29*1 + 6*(-3) + 10*(-1) = 1
  
// Example 3:
  // Input: nums = [3,6]
  // Output: false

package com.rishi;

public class IsGoodArray {
    public static void main(String[] args) {
        int[] nums = {12, 5, 7, 23};
        System.out.println(isGoodArray(nums));
    }

    static boolean isGoodArray(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
