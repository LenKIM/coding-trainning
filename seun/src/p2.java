import java.util.Scanner;

/**
 * author : sangeun lee
 */
public class p2 {
    public static void main(String[] args) {
        System.out.println("What is the input String?");
        String input = new Scanner(System.in).nextLine();

        while(input.length() <= 0) {
            System.out.println("Input is null. What is the input String?");
            input = new Scanner(System.in).nextLine();
        }

        System.out.println(input + " has " + input.length() + " characters");
    }
}