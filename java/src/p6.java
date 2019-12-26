import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class p6 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current age?");
        while (!scanner.hasNextLong()){
            scanner.next();
            System.out.println("confirm your input, It is only valid number");
        }
        long currentAge = scanner.nextLong();

        System.out.println("At what age would you like to retire?");
        while (!scanner.hasNextLong()){
            scanner.next();
            System.out.println("confirm your input, It is only valid number");
        }
        long retiringAge = scanner.nextLong();
        if ( currentAge > retiringAge){
            throw new RuntimeException("This person is already retired. You needs to check The number");
        }
        long leftYears = retiringAge - currentAge;
        System.out.println("You have " + leftYears + "years left until you can retire.");

        long currentYear = LocalDate.now().getYear();

        System.out.println("It's " + currentYear + ", so you can retire in " + Math.addExact(leftYears, currentYear) + "." + "years left until you can retire.");

    }
}
