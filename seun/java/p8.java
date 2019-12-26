import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-19.
 */
public class p8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many people? ");
        int people = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("How many pizzas do you have? ");
        int pizzas = ConvertUtil.parseStringToInt(br.readLine());
        System.out.println(people + " people with " + pizzas + " pieces of pizza.");

        int piecesPerPerson = pizzas * 8 / people;
        int leftPieces = pizzas * 8 % people;

        System.out.println("Each person gets " + piecesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftPieces + " leftover pieces");
    }
}
