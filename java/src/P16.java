import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = promptStringData("What is your age? ", sc);
        String result = Integer.parseInt(s) >= 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
        System.out.println(result);
    }

    private static String promptStringData(String message, Scanner sc) {
        System.out.println(message);
        return sc.next();
    }
}
