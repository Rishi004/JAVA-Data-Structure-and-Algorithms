// To find Armstrong Number between two given number.

public class Main {
    public static void main(String[] args) {
        int num = 9474;

        System.out.println(isArmstrong(num));
    }

    private static boolean isArmstrong(int num) {
        int temp = num;
        int numLen = (int) (Math.log10(num) + 1);
        int total = 0;

        while (temp > 0) {
            total += Math.pow(temp % 10, numLen);
            temp /= 10;
        }
        return num == total;
    }
}
