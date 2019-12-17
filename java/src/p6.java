import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class p6 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current age?");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("confirm your input, It is only valid int");
        }
        long currentAge = scanner.nextLong();

        System.out.println("At what age would you like to retire?");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("confirm your input, It is only valid int");
        }
        long retiringAge = scanner.nextLong();

        long leftYears = retiringAge - currentAge;
        System.out.println("You have " + leftYears + "years left until you can retire.");

        int year = LocalDate.now().getYear();

        System.out.println("It's " + year + ", so you can retire in " + Math.addExact(leftYears, year) + "." + "years left until you can retire.");

    }
}
