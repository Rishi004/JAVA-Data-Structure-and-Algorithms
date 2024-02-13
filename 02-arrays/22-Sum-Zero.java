// (1304)
// Given an integer n, return any array containing n unique integers such that they add up to 0.

// Example 1:
  // Input: n = 5
  // Output: [-7,-1,1,3,4]
  // Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
  
// Example 2:
  // Input: n = 3
  // Output: [-1,0,1]
  
// Example 3:
  // Input: n = 1
  // Output: [0]
  
package com.rishi;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    static int[] sumZero(int n) {
        if (n == 1) return new int[]{0};
        int[] nums = new int[n];
        int last = n - 1;
        if (n % 2 != 0) {
            nums[n - 1] = 0;
            last = n - 2;
        }
        int rand = (int) ((Math.random() * 10) + 1);
        for (int i = 0; i <= last; i++) {
            if (i % 2 == 0) nums[i] = rand + i;
            else nums[i] = 0 - nums[i - 1];
        }
        return nums;
    }
}
