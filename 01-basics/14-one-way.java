// There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character.
// Given two strings, write a function to check if they are one edit (or zero edits) away.

// Example
  // pale, ple   -> true
  // pale, pales -> true
  // pale, bale  -> true
  // pale, bake  -> false


// ------------------------------- OPTIMIZED SOLUTION -------------------------------
public class OneWay {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "bake";

        System.out.println(oneWay(str1, str2));
    }

    private static boolean oneWay(String str1, String str2) {

        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        int index1 = 0;
        int index2 = 0;
        boolean isDifferenceExist = false;
        String shorter = str1.length() < str2.length() ? str1 : str2;
        String longer = str1.length() < str2.length() ? str2 : str1;

        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (isDifferenceExist) {
                    return false;
                }
                isDifferenceExist = true;
                if (shorter.length() == longer.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }

        return true;
    }
}


// ------------------------------- BRUTE FORCE SOLUTION -------------------------------
public class OneWay {
    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "ple";

        System.out.println(oneWay(str1, str2));
    }

    private static boolean oneWay(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return replace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return insertRemoval(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return insertRemoval(str2, str1);
        } else {
            return false;
        }
    }

    private static boolean replace(String str1, String str2) {
        boolean isDifferenceExist = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (isDifferenceExist) {
                    return false;
                }
                isDifferenceExist = true;
            }
        }

        return true;
    }

    private static boolean insertRemoval(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                } else {
                    index2++;
                }
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }
}


