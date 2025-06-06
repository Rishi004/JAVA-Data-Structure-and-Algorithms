// Given two strings, write a method to decide if one is a permutation of the other.

// Example 1:
  // Input: str1 = "naruto", str2 = "rutona"
  // Output: true
  
// Example 2:
  // Input: str1 = "naruto", str2 = "naruta"
  // Output: false

// Example 3:
  // Input: str1 = "naruto", str2 = "naruto "
  // Output: false


// --------------------------- SOLUTION 01 ----------------------------
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(permutation("naruto", "ritona"));
    }

    private static boolean permutation(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        return sortStr(str1).equals(sortStr(str2));
    }

    private static String sortStr(String str) {
        char[] charSet = str.toCharArray();
        Arrays.sort(charSet);
        return new String(charSet);
    }
}


// --------------------------- SOLUTION 02 ----------------------------
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(permutation("naruto", "rutona"));
    }

    private static boolean permutation(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        int[] valSet = new int[128];
        for (char c : str1.toCharArray()) {
            valSet[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i);
            valSet[c]--;
            if (valSet[c] < 0) return false;
        }

        return true;
    }

}









