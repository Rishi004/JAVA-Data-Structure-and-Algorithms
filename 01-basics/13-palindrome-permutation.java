// Given a string, write a function to check if it is a permutaion of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words.

// Example 1:
  // Input: str = "Le Lev"
  // Output: true --> ( level, elvle )
  
// Example 2:
  // Input: str1 = "naruto"
  // Output: false


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "Tact Coa";
        System.out.println(palindromePermutation(str));
    }

    private static boolean palindromePermutation(String str) {
        str = str.toLowerCase(Locale.ROOT).replaceAll("\\s+", "");

        int[] valSet = new int[26];
        int odd = 0;

        for (char c : str.toCharArray()) {
            int val = c - 'a';
            valSet[val]++;
            if (valSet[val] % 2 == 1) odd++;
            else odd--;
        }

        return odd <= 1;
    }

}
