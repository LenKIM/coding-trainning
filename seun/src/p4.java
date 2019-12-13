import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p4 {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String noun = getInput();
        System.out.print("Enter a verb: ");
        String verb = getInput();
        System.out.print("Enter an adjective: ");
        String adjective = getInput();
        System.out.print("Enter an adverb: ");
        String adverb = getInput();

        System.out.println(noun + verb + adjective + adverb);
    }

    private static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}
