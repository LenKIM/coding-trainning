import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long euroTo = Util.promptLongData("How many Euros are you exchanging? ", sc);
        double rateNumber = Util.promptDoubleData("What is the exchange rate? ", sc);
        double rate = rateNumber * 0.01;
        double v = euroTo * rate;
        double euroFrom = Math.round(v * 100) / 100.0;
        System.out.println(euroTo + " Euros at an exchange rate of " + rateNumber + " is " + euroFrom + " dollars");

    }
}
