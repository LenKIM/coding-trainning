import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by SangEun on 2019-12-24.
 */
public class p10 {

    static final double TAX = 0.055;
    private static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        double price;
        int quantity;
        int count = 3;

        while(count > 0) {
            System.out.print("Name of item : ");
            name = br.readLine();
            System.out.print("Price of item : ");
            price = ConvertUtil.parseStringToDouble(br.readLine());
            System.out.print("Quantity of item : ");
            quantity = ConvertUtil.parseStringToInt(br.readLine());
            items.add(new Item(name, price, quantity));

            calculateSubtotal();
            count = count - 1;
        }

        calculateTotal();
    }

    private static void calculateSubtotal() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice = totalPrice + item.subtotal;
        }

        double tax = totalPrice * TAX;
        System.out.println("------------------------ SubTotal ------------------------");
        System.out.println("Price: " + totalPrice);
        System.out.println("Tax: " + tax);
        System.out.println("----------------------------------------------------------");
    }

    private static void calculateTotal() {
        System.out.println("\n------------------------ Total ------------------------");
        double totalPrice = 0;
        int totalCount = 0;

        for (Item item : items) {
            totalPrice = totalPrice + item.subtotal;
            totalCount = totalCount + item.quantity;

            System.out.println(item.name + " Count: " + item.quantity);
        }

        double tax = totalPrice * TAX;

        System.out.println("Total Count : " + totalCount);
        System.out.println("Total Tax : " + tax);
        System.out.println("Total Price: " + totalPrice + tax);
    }

    private static class Item {
        String name;
        double price;
        int quantity;
        double subtotal;

        Item(String name, double p, int q) {
            this.name = name;
            this.price = p;
            this.quantity = q;
            this.subtotal = p * q;
        }
    }
}
