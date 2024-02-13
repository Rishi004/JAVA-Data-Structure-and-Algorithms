// Define a method to find out if a number is prime or not.

package com.rishi;

public class PrimeFinder {
    public static void main(String[] args) {
        int num = 15467;
        System.out.println(isPrime(num));
    }

    private static String isPrime(int num) {
        if (num <= 1) return "Neither prime nor composite";

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) return "Not a prime";
            c++;
        }
        return "Prime";
    }
}

