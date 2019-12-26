import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-26.
 */
public class p11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many Euros are you exchanging? ");
        double targetEuro = ConvertUtil.parseStringToDouble(br.readLine());
        System.out.print("What is the exchange rate? ");
        double exchangeRate = ConvertUtil.parseStringToDouble(br.readLine());

        double result = Math.ceil(targetEuro * exchangeRate);

        System.out.println(targetEuro + " Euros at an exchage rate of " + exchangeRate + " is " + result + " dollars");
    }
}
