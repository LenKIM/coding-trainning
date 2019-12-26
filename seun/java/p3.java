import java.util.Scanner;

/**
 * author : sangeun lee
 */
public class p3 {
    public static void main(String[] args) {
        System.out.println("What is the quote? ");
        String quote = new Scanner(System.in).nextLine();

        System.out.println("Who said it? ");
        String name = new Scanner(System.in).nextLine();

        System.out.println(name + " says," + " \"" + quote + "\"");
    }
}