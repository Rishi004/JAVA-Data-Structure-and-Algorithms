// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
// LEETCODE -> 867. Transpose Matrix

// Example 1:
  // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
  // Output: [[1,4,7],[2,5,8],[3,6,9]]

// Example 2:
  // Input: matrix = [[1,2,3],[4,5,6]]
  // Output: [[1,4],[2,5],[3,6]]

package com.rishi;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                // {7, 8, 9},
        };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    static int[][] transpose(int[][] matrix) {
        int[][] out = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out[j][i] = matrix[i][j];
            }
        }

        return out;
    }
}

 
