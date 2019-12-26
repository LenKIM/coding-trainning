import java.util.Scanner;

public class P8 {

    String a;
    int b;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many people?");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long personCount = sc.nextLong();

        System.out.println("How many pizzas do you have?");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long pizzaCount = sc.nextLong();

        System.out.println("How many pieces are in a pizza?");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long piecesPerPizza = sc.nextLong();

        System.out.println(personCount + " people with " + pizzaCount + " pizzas");

        long totalPizzaCount = Math.multiplyExact(pizzaCount, piecesPerPizza);

        long div = Math.floorDiv(personCount, totalPizzaCount);
        long mod = Math.floorMod(personCount, totalPizzaCount);

        System.out.println("Each person gets " +  div  + "  pieces of pizza.");
        System.out.println("There are " +  mod  + " leftover pieces.");
    }
}
