// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
// LEETCODE -> 1832. Check if the Sentence Is Pangram

// Example 1:
  // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
  // Output: true
  // Explanation: sentence contains at least one of every letter of the English alphabet.
  
// Example 2:
  // Input: sentence = "leetcode"
  // Output: false

package com.rishi;

public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isAlphabetic(c)) alphabet[c - 'a'] = true;
        }

        for (boolean present : alphabet) {
            if (!present) return false;
        }

        return true;
    }
}
