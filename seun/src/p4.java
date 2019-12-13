import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p4 {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        String sentence = new Scanner(System.in).nextLine();
        System.out.print("Enter a verb: ");
        sentence = getInputString(sentence);
        System.out.print("Enter an adjective: ");
        sentence = getInputString(sentence);
        System.out.print("Enter an adverb: ");
        sentence = getInputString(sentence);

        System.out.println(sentence);
    }

    @NotNull
    private static String getInputString(String sentence) {
        sentence = sentence + " " + new Scanner(System.in).nextLine();
        return sentence;
    }
}
