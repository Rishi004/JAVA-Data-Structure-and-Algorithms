//     *
//    * *
//   *   *
//  *     *
// *********


package com.rishi.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
