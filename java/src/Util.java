import java.util.Scanner;

public class Util {

    public static long promptLongData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextLong();
    }

    public static double promptDoubleData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextDouble();
    }
}
