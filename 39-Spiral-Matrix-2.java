// (59)
// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

// Example 1:
  // Input: n = 3
  // Output: [[1,2,3],[8,9,4],[7,6,5]]
  
// Example 2:
  // Input: n = 1
  // Output: [[1]]

// Constraints:
  // 1 <= n <= 20

package com.rishi;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1, top = 0, left = 0, right = n - 1, bottom = n - 1;

        while (top <= bottom && left <= right && num <= n * n) {
            for (int i = left; i <= right; i++, num++) {
                matrix[left][i] = num;
            }
            top++;

            for (int i = top; i <= bottom; i++, num++) {
                matrix[i][right] = num;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--, num++) {
                    matrix[bottom][i] = num;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--, num++) {
                    matrix[i][left] = num;
                }
                left++;
            }

        }

        return matrix;
    }
}
