import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-26.
 */
public class p13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the principal amount? ");
        int principal = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("What is the rate: ");
        double rate = ConvertUtil.parseStringToDouble(br.readLine()) ;
        System.out.print("What is the number of years: ");
        int years = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("What is the number of times the interest is compounded per year: ");
        int compoundedYear = ConvertUtil.parseStringToInt(br.readLine());

        int result = (int) Math.ceil(principal * Math.pow((1 + rate / 100 / compoundedYear), years * compoundedYear));

        System.out.println(principal + " invested at " + rate + "% for " + years + " years compuonded " + compoundedYear + " times per year is " + result);
    }
}
