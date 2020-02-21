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

    static double promptDoubleData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextDouble();
    }

    static String promptData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextLine()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextLine();
    }

    static String promptDataWithPattern(String message, Scanner sc, String pattern) {
        System.out.println(message);
        while (!sc.hasNext(pattern)) {
            sc.next();
            System.out.println("try to input valid");
        }
        return sc.next().toLowerCase();
    }
}
