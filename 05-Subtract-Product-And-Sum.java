// 1281. Subtract the Product and Sum of Digits of an Integer
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

// Example 1:
  // Input: n = 234
  // Output: 15 
  // Explanation: 
  // Product of digits = 2 * 3 * 4 = 24 
  // Sum of digits = 2 + 3 + 4 = 9 
  // Result = 24 - 9 = 15

// Example 2:
  // Input: n = 4421
  // Output: 21
  // Explanation: 
  // Product of digits = 4 * 4 * 2 * 1 = 32 
  // Sum of digits = 4 + 4 + 2 + 1 = 11 
  // Result = 32 - 11 = 21

package com.rishi;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int num = 234;
        System.out.println(subtractProductAndSum(num));
    }

    static int subtractProductAndSum(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            sum += num % 10;
            product *= num % 10;

            num /= 10;
        }

        return product - sum;
    }
}
