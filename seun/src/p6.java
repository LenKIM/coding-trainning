import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your current age? ");
        String age = br.readLine();
        System.out.print("At what age would you like to retire? ");
        String retire = br.readLine();

        try {
            int leftYear = Integer.parseInt(retire) -Integer.parseInt(age);
            int thisYear = Calendar.getInstance().getWeekYear();
            int retireYear = thisYear + leftYear;

            if(leftYear <= 0) {
                System.out.println("You already retired");
                return;
            }
            System.out.println("You have " + leftYear + " years left until you can retire.");
            System.out.println("It's " + thisYear + ", so you can retire in " + retireYear + ".");
        } catch(NumberFormatException | NullPointerException e) {
            System.out.println("Format error. Please retry.");
        }
    }
}
