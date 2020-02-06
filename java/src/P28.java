import java.util.Scanner;

public class P28 {

    public static void main(String[] args) {

        final int TOTAL_COUNT = 5;
        int current = 0;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        while (current < TOTAL_COUNT){
            long num = Util.promptLongData("Enter a number", sc);
            sum = sum + num;
            current = current + 1;
        }
        System.out.println("The total is " + sum + ".");

    }
}
