// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string "aabcccccaaa" would become "a2b1c5a3".
// If the "compressed" string would not become smaller than the original string, your method should return the original string.
// You can assume the string has only uppercase and lowercase letters (a-z).


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



