import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the first number?");
        String firstNumber = br.readLine();
        int i = Integer.parseInt(firstNumber);

        System.out.println("What is the second number?");
        String secondNumber = br.readLine();
        int j = Integer.parseInt(secondNumber);

        System.out.println(i + " + " + j + " = " + i + j);
        System.out.println(i + " - " + j + " = " + (i - j));
        System.out.println(i + " * " + j + " = " + i * j);
        System.out.println(i + " / " + j + " = " + i / j);
    }
}
