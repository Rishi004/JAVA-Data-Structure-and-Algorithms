// (54)
// Given an m x n matrix, return all elements of the matrix in spiral order.

// Example 1:
  // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
  // Output: [1,2,3,6,9,8,7,4,5]

// Example 2:
  // Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
  // Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Constraints:
  // m == matrix.length
  // n == matrix[i].length
  // 1 <= m, n <= 10
  // -100 <= matrix[i][j] <= 100

package com.rishi;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, top = 0, right = n - 1, bottom = m - 1;
        List<Integer> out = new ArrayList<>();

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                out.add(matrix[left][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                out.add(matrix[i][right]);
            }
            right--;

            if (top<= bottom) {
                for (int i = right; i >= left; i--) {
                    out.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    out.add(matrix[i][left]);
                }
                left++;
            }
        }

        return out;
    }
}
