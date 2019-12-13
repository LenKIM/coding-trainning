import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome Len World Story");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a noun: " );
        String noun = br.readLine();

        System.out.println("Enter a verb: " );
        String verb = br.readLine();

        System.out.println("Enter an adjective : " );
        String adjective = br.readLine();

        System.out.println("Enter an adverb : " );
        String adverb = br.readLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " ?" + " That's hilarious!");
    }
}
