import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String result = "Hello," + name.toString() +", nice to meet you!";
        System.out.println(result);
    }
}
