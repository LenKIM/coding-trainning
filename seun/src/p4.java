import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        print("Enter a noun: ");
        String sentence = br.readLine();
        print("Enter a verb: ");
        sentence = sentence + " " + br.readLine();
        print("Enter an adjective: ");
        sentence = sentence + " " + br.readLine();
        print("Enter an adverb: ");
        sentence = sentence + " " + br.readLine();

        System.out.println(sentence);
    }

    private static void print(String s) {
        System.out.print(s);
    }
}
