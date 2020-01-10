import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {

        float WI_STATE = 0.55F;
        Scanner sc = new Scanner(System.in);
        float orderAmount = promptData("What is the order amount?", sc);
        String state = promptStringData("What is the state?", sc);
        float total = 0;
        if ("WI".equals(state.trim())) {
            total = WI_STATE + orderAmount;
        }
        System.out.println("The subtotal is $" + orderAmount);
        System.out.println("The tax is " + WI_STATE);
        System.out.println("The total is $" + total);
    }

    private static String promptStringData(String message, Scanner sc) {
        System.out.println(message);
        return sc.next();
    }

    private static float promptData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextFloat();
    }
}
