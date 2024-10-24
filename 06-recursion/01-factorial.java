// Find the factorial of given number n => n!


package com.rishi.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
