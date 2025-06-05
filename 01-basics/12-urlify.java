// URLify

public class Main {
    public static void main(String[] args) {
        System.out.println(urlify("Mr Jon Doe   "));
    }

    private static String urlify(String str) {
        return str.trim().replaceAll(" ", "%20");
    }

}
