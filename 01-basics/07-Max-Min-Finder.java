// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
// without using Math.max

package com.rishi;

import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Print the maximum and minimum numbers
        System.out.println("Maximum number: " + findMax(num1, num2, num3));
        System.out.println("Minimum number: " + findMin(num1, num2, num3));

        scanner.close();
    }

    // Method to find and return the maximum of three numbers
    static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
      
        // return Math.max(Math.max(a, b), c);
    }

    // Method to find and return the minimum of three numbers
    static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
      
        // return Math.min(Math.min(a, b), c);
    }
}

