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
        double ceil = Math.ceil(div);
        System.out.println("You will need to purchase" + ceil + "liters of paint to cover" + ceilingWidth + "square meters.");
    }
}
