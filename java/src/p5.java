import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p5 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("should input integer");
        }
        long first = scanner.nextLong();
        System.out.println("What is the second number?");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("should input integer");
        }
        long second = scanner.nextLong();
        System.out.println(first + " + " + second + " = " + Math.addExact(first, second));
        System.out.println(first + " - " + second + " = " + Math.subtractExact(first,second));
        System.out.println(first + " * " + second + " = " + Math.multiplyExact(first, second));
        System.out.println(first + " / " + second + " = " + Math.floorDiv(first, second));
    }
}
