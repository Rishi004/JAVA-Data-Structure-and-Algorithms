// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string "aabcccccaaa" would become "a2b1c5a3".
// If the "compressed" string would not become smaller than the original string, your method should return the original string.
// You can assume the string has only uppercase and lowercase letters (a-z).


// ------------------------------- OPTIMIZED SOLUTION -------------------------------
// This will be more optimal in cases where we don't have a large number of repeating characters.

// One other benefit of this approach is that we can initialize StringBuilder to its necessary capacity up-front.
// StringBuilder will (behind the scene) need to double its capacity every time it hits capacity.
// The capacity could be double what we ultimately need.

// The downside of this is that it causes a second loop through the characters and also adds nearly duplicated code.

public class StringCompression {

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(stringCompression(str));
    }

    private static String stringCompression(String str) {

        int compressedLength = countCompressedLength(str);
        if (compressedLength > str.length()) {
            return str;
        }

        int count = 0;
        StringBuilder output = new StringBuilder(compressedLength);

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                output.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return output.toString();
    }

    private static int countCompressedLength(String str) {
        int compressedLength = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(count).length();
                count = 0;
            }
        }

        return compressedLength;
    }
}


// ------------------------------- BRUTE FORCE SOLUTION -------------------------------
public class StringCompression {

    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(stringCompression(str));
    }

    private static String stringCompression(String str) {

        int count = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                output.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return str.length() > output.length() ? output.toString() : str;
    }
  
}



