// *****
//  ****
//   ***
//    **
//     *


package com.rishi.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int maxSpace = row - 1;
            for (int space = 1; space <= maxSpace; space++) {
                System.out.print(" ");
            }
            
            int maxCol = n - row + 1;
            for (int col = 1; col <= maxCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
