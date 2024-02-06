// There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
// For each location indices[i], do both of the following:
  // 1. Increment all the cells on row ri.
  // 2. Increment all the cells on column ci.
// Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//LEETCODE -> 1252. Cells with Odd Values in a Matrix

// Example 1:
  // Input: m = 2, n = 3, indices = [[0,1],[1,1]]
  // Output: 6
  // Explanation: Initial matrix = [[0,0,0],[0,0,0]].
  // After applying first increment it becomes [[1,2,1],[0,1,0]].
  // The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
  
// Example 2:
  // Input: m = 2, n = 2, indices = [[1,1],[0,0]]
  // Output: 0
  // Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.

// ---------- Way -> 01 ----------
package com.rishi;

import java.util.Arrays;

public class OddCells {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        //rows
        for (int[] rc : indices) {
            rows[rc[0]]++;
            cols[rc[1]]++;
        }

        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(cols));

        int oddRows = 0;
        for (int row : rows) {
            if (row % 2 == 1) {
                oddRows++;
            }
        }

        int oddCols = 0;
        for (int col : cols) {
            if (col % 2 == 1) {
                oddCols++;
            }
        }

        int odds = (oddRows * n) + (oddCols * m);
        int evensFromCrossOver = oddRows * oddCols;
        if (odds > 0 && oddRows > 0 && oddCols > 0) {
            // Since the odds and evens are BOTH incremented, you need to decrement this count twice.
            odds = odds - (2 * evensFromCrossOver);
        }

        return odds;
    }
}

// ---------- Way -> 02 ----------
package com.rishi;

import java.util.Arrays;

public class OddCells {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int oddCount = 0;
        int[][] out = increment(m, n, indices);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (out[i][j] % 2 == 1) oddCount++;
            }
        }

        return oddCount;
    }

    static int[][] increment(int m, int n, int[][] indices) {
        int[][] out = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            for (int j = 0; j < n; j++) {
                out[r][j]++;
            }
            for (int j = 0; j < m; j++) {
                out[j][c]++;
            }
        }
        return out;
    }
}
