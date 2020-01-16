import java.util.Scanner;

/**
 * 단리를 계산하는 것은 투자에 대한 수익이 있는지를 빠르게 판단할 수 있는 아주 훌륭한 방법이다.
 * 마찬가지로 프로그램의 명령 순서대로 명 확하게 코딩을 하는 것도 마음이 편안해지도록 만들 수 있는 좋은 방법이다.
 * <p>
 * 단리를 계산하는 프로그램을 작성하라.
 * 원금을 입력 받은 다음 이자를 퍼센트 단위로 입력 받고, 기간을 연단위로 입력 받은 후 원리금(원 금+이자)을 출력해보자.
 * <p>
 * 단리 공식은 다음과 같다.
 * <p>
 * A = P(1+rt)
 * <p>
 * P: 원금
 * r: 연이율
 * t: 기간(연단위)
 * A: 원리금
 * #출력 예 Enter the principal: 1500
 * <p>
 * Enter the rate of interest: 4.3
 * <p>
 * Enter the number of years: 4
 * <p>
 * After 4 years at 4.3%, the investment will be worth 758
 */
public class P12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long principal = Util.promptLongData("Enter the principal:", sc);
        long rateNumber = Util.promptLongData("Enter the rate of interest: ", sc);
        long year = Util.promptLongData("Enter the number of years: ", sc);
        double rate = rateNumber * 0.01;

        double A = calculateSimpleInterest(principal, rate, year);
        System.out.println("After" + year + "years at " + rate + "%, the investment will be worth " + A);

    }

    private static double calculateSimpleInterest(long principal, double rate, long year) {
        return principal * (1 + (rate * year));
    }
}
