import java.util.Scanner;

/**
 * 카드 대금 상환 기간
 * 카드 대금 상환하는 데는 생각보다 더 오랜 시간이 걸린다. 그리고 상환하는 공식 또한 매우 복잡하다.
 * 이러한 공식의 복잡도를 함수로 숨기는 것 역시 여러분의 코드가 조직화되도록 하는 데 도움이 된다.
 * 카드 대금을 상환하는 데 걸리는 개월 수를 계산하는 프로그램을 각성하라.
 * 총 대금, 연이율(Annual Percentage Rate APR), 월 상환 금액을 입력 받은 다음 상환에 소요되는 공식은 다음과 같다.
 */
public class P26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //총 대금
        long balance = Util.promptLongData("What is your balance? ", sc);
        //연이율
        long month = Util.promptLongData("What is the APR on the card (as a percent)? ", sc);

        //월 상환 금액
        long monthlyPayment = Util.promptLongData("What is the monthly payment you can make? ", sc);

        double v = calculateMonthsUntilPaidOff(balance, month, monthlyPayment);
        System.out.println("It will take you " + v + "months to pay off this card");

    }

    private static double calculateMonthsUntilPaidOff(long balance, long month, long monthlyPayment) {
        double i = Math.floorDiv(month, 365);
        System.out.println(i);
        double l = Math.floorDiv(balance, monthlyPayment);
        System.out.println(l);
        double v = 1 + Math.pow(1 + i, 30);
        System.out.println(v);
        double v1 = v * l;
        System.out.println(v1); //100
        double upper = Math.log(1 + v1);
        System.out.println(upper);
        double below = Math.log(1 + i);
        System.out.println(below);
        return (upper / below) * (-(1/30));
    }
}
