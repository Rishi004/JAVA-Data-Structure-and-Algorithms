// To find out whether the given String is Palindrome or not.

public class Main {
    public static void main(String[] args) {
        String str = "radar";

        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length - 1;

        while (start < end) {
            if (charArr[start] != charArr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
