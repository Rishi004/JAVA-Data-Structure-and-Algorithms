// (73)
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

// Example 1:
  // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
  // Output: [[1,0,1],[0,0,0],[1,0,1]]
  
// Example 2:
  // Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
  // Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// Constraints:
  // m == matrix.length
  // n == matrix[0].length
  // 1 <= m, n <= 200
  // -231 <= matrix[i][j] <= 231 - 1

package com.rishi;

import javafx.util.Pair;
import java.util.*;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        int k = 0;
        int r = matrix.length;
        int c = matrix[0].length;
        List<Pair<Integer, Integer>> pairList = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    pairList.add(new Pair<>(i, j));
                }
            }
        }

        convertMatrix(matrix, pairList, r, c);
        System.out.println(Arrays.deepToString(matrix));
    }

    static void convertMatrix(int[][] matrix, List<Pair<Integer, Integer>> pairList, int r, int c) {
        for (Pair<Integer, Integer> pair : pairList) {
            int row = pair.getKey();
            int col = pair.getValue();

            for (int i = 0; i < c; i++) {
                matrix[row][i] = 0;
            }

            for (int i = 0; i < r; i++) {
                matrix[i][col] = 0;
            }
        }
    }

}
