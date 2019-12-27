import java.util.Scanner;

/**
 * A = P(1+r)^t
 * * <p>
 * S: 만기금액
 * P: 투자 원금
 * i: 연간 연이율
 * n: 기간(연단위)
 * k: 이자 지급 횟수가 연 k차례
 * <p>
 * S = P(1 + i)^n -> 년단위
 * S = P(1 + i/k)^kn -> 이자 지급 휫수가 연수 k차례인 복리식
 */
public class P13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long principal = Util.promptLongData("What is the principal amount? ", sc);
        long rateNumber = Util.promptLongData("What is the rate: ", sc);
        long n = Util.promptLongData("What is the number of years: ", sc);
        long k = Util.promptLongData("What is the number of times the interest is compounded per n:", sc);

        double i = rateNumber * 0.01;

        double A = calculateSimpleInterest(principal, i, n, k);
        System.out.println(principal + "invested at " + i + "% for " + n + " years compounded " + k + " times per n is" + A);
    }
    private static double calculateSimpleInterest(long principal, double rate, long year, long k) {
        return principal * (Math.pow(1 + rate / k, year * k));
    }
}
