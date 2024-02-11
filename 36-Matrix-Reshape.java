// (566)
// In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
// You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
// The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
// If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

// Example 1:
  // Input: mat = [[1,2],[3,4]], r = 1, c = 4
  // Output: [[1,2,3,4]]
  
// Example 2:
  // Input: mat = [[1,2],[3,4]], r = 2, c = 4
  // Output: [[1,2],[3,4]]

package com.rishi;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] out = new int[r][c];
        int row = 0;
        int col = 0;

        if (mat.length * mat[0].length == r * c) {
            for (int[] ints : mat) {
                for (int i : ints) {
                    if (col == c) {
                        row++;
                        col = 0;
                    }
                    out[row][col] = i;
                    col++;
                }
            }
            return out;
        }

        return mat;
    }
}
