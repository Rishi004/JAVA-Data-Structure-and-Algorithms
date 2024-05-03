// (1351)
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Example 1:
  // Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
  // Output: 8
  // Explanation: There are 8 negatives number in the matrix.

// Example 2:
  // Input: grid = [[3,2],[1,0]]
  // Output: 0


package com.rishi.searching;

public class CountNegatives {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int currRow = 0;
        int currCol = cols - 1;
        int count = 0;

        while (currRow < rows && currCol >= 0) {
            if (grid[currRow][currCol] < 0) {
                count += rows - currRow;
                currCol--;
            } else {
                currRow++;
            }
        }

        return count;
    }
}
