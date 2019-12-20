import java.util.Scanner;

public class P9 {

    public static void main(String[] args) {

        final int UNIT_LITER = 9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the length");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long length = sc.nextLong();

        System.out.println("Input the width");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long width = sc.nextLong();

        long ceilingWidth = Math.multiplyExact(length, width);

        long div = Math.floorDiv(ceilingWidth, UNIT_LITER);
        if (Math.floorMod(ceilingWidth, UNIT_LITER) > 0) {
            div = div + 1;
        }
        System.out.println("You will need to purchase" + div + "liters of paint to cover" + ceilingWidth + "square meters.");
    }
}
