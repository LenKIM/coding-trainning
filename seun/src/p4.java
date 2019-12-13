import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p4 {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String sentence = new Scanner(System.in).nextLine();
        System.out.print("Enter a verb: ");
        sentence = sentence + " " + new Scanner(System.in).nextLine();
        System.out.print("Enter an adjective: ");
        sentence = sentence + " " +  new Scanner(System.in).nextLine();
        System.out.print("Enter an adverb: ");
        sentence = sentence + " " +  new Scanner(System.in).nextLine();

        System.out.println(sentence);
    }
}
