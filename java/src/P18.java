import java.util.Scanner;

/**
 * 온도 변환
 * C = (F - 32) X 5/9
 * F = (C X 9) + 32
 */
public class P18 {

    public static void main(String[] args) {

        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("[FfCc]")) {
            sc.next();
            System.out.println("잘못된 입력입니다. 확인해주시기 바랍니다.");
        }
        String type = sc.next().toLowerCase();
        if ("C".equals(type) || "c".equals(type)) {
            double v = promptGetData("Please enter the temperature in Celsius: ", sc);
            System.out.println("The temperature in Celsius is " + Celsius2FahrenheitConvert(v));

        }

        if ("F".equals(type) || "f".equals(type)) {
            double v = promptGetData("Please enter the temperature in Fahrenheit: ", sc);
            System.out.println("The temperature in Fahrenheit is " + Fahrenheit2CelsiusConvert(v));

        }
    }

    private static double Fahrenheit2CelsiusConvert(double v) {
        return (v - 32) * 5 / 9;
    }

    private static double Celsius2FahrenheitConvert(double v) {
        return (v * 9 / 5) + 32;
    }

    private static double promptGetData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextDouble();
    }
}
