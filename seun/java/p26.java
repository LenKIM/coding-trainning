import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.log;

/**
 * Created by SangEun on 2020-01-31.
 *
 * 카드 대금을 상환하는 데 걸리는 개월 수를 계산하는 프로그램을 작성하라.
 * 총 대금, 연이율, 월 상환 금액을 입력받은 다음 상환에 소요되는 개월 수를 출력한다.
 * 공식: n = -1/30 * log( 1 + b/p * (1 + Math.pow((1 + i), 30) ) / log(1 + i)
 *
 * n: 개월 수
 * i: 일이율(APR/365)
 * b: 총 대금
 * p: 월 상환 금액
 *
 * 제약 조건
 * 1. 카드의 연이율을 입력 받은 후 내부적으로 일이율을 계산할 것
 * 2. 연이율은 10진수가 아닌 퍼센트 단위로 받을 것
 * 3. 총 대금, 연이율, 월 상환 금액을 인수로 받고 상환 개월 수를 반환하는
 *    calculateMonthsUntilPaidOff 함수를 작성할 것
 *    이 때 인수는 함수 바깥에서 접근하지 않도록 한다.
 * 4. 금액은 센트 단위로 올림할 것
 */
public class p26 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your balance? ");
        int balance = ConvertUtil.parseStringToInt(br.readLine());

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = ConvertUtil.parseStringToDouble(br.readLine());

        System.out.print("What is the monthly payment you can make? ");
        int monthlyPay = ConvertUtil.parseStringToInt(br.readLine());

        int result = calculateMonthsUntilPaidOff(balance, apr, monthlyPay);
        System.out.println("It will take you " + result + " months to pay off this card.");
    }

    private static int calculateMonthsUntilPaidOff(int balance, double apr, int monthlyPay) {
        double dayApr = apr / 365;
        return (int) Math.ceil((-1 / 30 * log( 1 + balance / monthlyPay * (1 + Math.pow(1 + dayApr, 30) )) / log(1 + dayApr)));
    }
}
