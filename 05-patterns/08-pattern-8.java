//     *
//    ***
//   *****
//  *******
// *********


package com.rishi.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int maxSpace = n - row;
            for (int space = 1; space <= maxSpace; space++) {
                System.out.print(" ");
            }

            int maxCol = 2 * row - 1;
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
