import java.util.Scanner;

public class P22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long first = Util.promptLongData("Enter the first number ", sc);
        final long second = Util.promptLongData("Enter the second number ", sc);
        final long third = Util.promptLongData("Enter the third number ", sc);

        if (first == second || first == third || second == third){
            return;
        }
        final long max = Math.max(first, Math.max(second, third));
        System.out.println("The largest number is " + max);
        sc.close();
    }
}
