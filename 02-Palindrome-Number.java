// To find out whether the given integer is Palindrome or not.

public class Main {
    public static void main(String[] args) {
        int num = 12321;

        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        int temp = num;
        int reverseNum = 0;
        while (temp > 0) {
            reverseNum = (reverseNum * 10) + (temp % 10);
            temp /= 10;
        }
        return num == reverseNum;
    }
}
