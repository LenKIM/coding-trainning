import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p6 {
    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        String age = new Scanner(System.in).nextLine();
        System.out.print("At what age would you like to retire? ");
        String retire = new Scanner(System.in).nextLine();

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
