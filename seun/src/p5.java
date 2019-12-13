import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p5 {
    public static void main(String[] args) {
        System.out.print("What is the first number? ");
        String firstStr = new Scanner(System.in).nextLine();
        System.out.print("What is the second number? ");
        String secondStr = new Scanner(System.in).nextLine();

        try {
            int firstNum = Integer.parseInt(firstStr);
            int secondNum = Integer.parseInt(secondStr);

            if(firstNum < 0 || secondNum < 0) { throw new NumberFormatException(); }

            System.out.println(firstNum + " + " + secondNum + " = " + getPlus(firstNum, secondNum) + "\n" +
                            firstNum + " - " + secondNum + " = " + getMinus(firstNum, secondNum) + "\n" +
                            firstNum + " * " + secondNum + " = " + getMultiple(firstNum, secondNum) + "\n" +
                            firstNum + " / " + secondNum + " = " + getDivision(firstNum, secondNum) + "\n");
        } catch(NumberFormatException | NullPointerException e) {
            System.out.println("Format error. Please retry.");
        }
    }

    private static int getDivision(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    private static int getMultiple(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    private static int getMinus(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static int getPlus(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
