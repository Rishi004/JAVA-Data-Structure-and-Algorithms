// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use Math.pow(x, 05)
 
// Example 1:
  // Input: x = 4
  // Output: 2
  // Explanation: The square root of 4 is 2, so we return 2.
  
// Example 2:
  // Input: x = 8
  // Output: 2
  // Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

package com.rishi.searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x / mid >= mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right - 1;
    }
}
