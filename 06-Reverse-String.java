// Reverse A String In Java

// Example 1:
  // Input: str = "java"
  // Output: "avaj"

// Example 2:
  // Input: str = "reverse"
  // Output: "esrever"

package com.rishi;

public class ReverseString {
    public static void main(String[] args) {
        String str = "reverse";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
