import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-26.
 */
public class p12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the principal: ");
        int principal = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("Enter the rate of interest: ");
        double interest = ConvertUtil.parseStringToDouble(br.readLine());
        System.out.print("Enter the number of years: ");
        int years = ConvertUtil.parseStringToInt(br.readLine());

        int result = calculateSimpleInterest(principal, interest, years);

        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth " + result);
    }

    private static int calculateSimpleInterest(int principal, double interest, int years) {
        return (int) Math.ceil(principal * (1 + interest / 100 * years));
    }
}
