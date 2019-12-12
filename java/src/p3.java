import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3 {

    public static void main(String[] args) throws IOException {

        System.out.println("What is the quote?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quote = br.readLine();
        System.out.println("Who said it?");
        String who = br.readLine();
        System.out.println(who + "says, \"" + quote + "\"");
    }
}
