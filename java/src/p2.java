import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {

    public static void main(String[] args) throws IOException {
        System.out.println("What is the input string?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int length = input.length();
        System.out.println(input + "has" + length + "characters.");
    }
}
