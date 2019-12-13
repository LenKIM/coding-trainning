import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p4 {
    public static void main(String[] args) {
        print("Enter a noun: ");
        String sentence = new Scanner(System.in).nextLine();
        print("Enter a verb: ");
        sentence = updateSentence(sentence);
        print("Enter an adjective: ");
        sentence = updateSentence(sentence);
        print("Enter an adverb: ");
        sentence = updateSentence(sentence);

        System.out.println(sentence);
    }

    private static void print(String s) {
        System.out.print(s);
    }

    @NotNull
    private static String updateSentence(String sentence) {
        sentence = sentence + " " + new Scanner(System.in).nextLine();
        return sentence;
    }
}
