import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class p6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your current age?");
        String currentAge = br.readLine();

        int i = Integer.parseInt(currentAge);

        System.out.println("At what age would you like to retire?");
        String retiringAge = br.readLine();
        int j = Integer.parseInt(retiringAge);

        int leftYears = j - i;
        System.out.println("You have " + leftYears + "years left until you can retire.");

        int year = LocalDate.now().getYear();

        System.out.println("It's " + year + ", so you can retire in " + (year + leftYears) + "." + "years left until you can retire.");

    }
}
