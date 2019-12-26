import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-13.
 */
public class p5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the first number? ");
        String firstStr = br.readLine();
        System.out.print("What is the second number? ");
        String secondStr = br.readLine();

        int firstNum = ConvertUtil.parseStringToInt(firstStr);
        int secondNum = ConvertUtil.parseStringToInt(secondStr);

        if(firstNum < 0 || secondNum < 0) { throw new NumberFormatException(); }

        System.out.println(firstNum + " + " + secondNum + " = " + getPlus(firstNum, secondNum) + "\n" +
                            firstNum + " - " + secondNum + " = " + getMinus(firstNum, secondNum) + "\n" +
                            firstNum + " * " + secondNum + " = " + getMultiple(firstNum, secondNum) + "\n" +
                            firstNum + " / " + secondNum + " = " + getDivision(firstNum, secondNum) + "\n");

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
