import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-31.
 *
 * 입력한 가격에 대한 세금을 계산하는 간단한 프로그램을 작성하라.
 * 프로그램은 주문 가격과 함께 주(State) 이름을 입력 받는데, 이름이 'WI'인 경우 세율은 5.5%가 된다.
 * 프로그램은 위스콘신 주 거주자에 해당하는 소계, 세율, 합계 금액을 출력하지만 다른 주에 거주하는 경우에는 합계 금액만을 출력한다.
 *
 * 제약 조건
 * 1. 오직 if문만 사용하여 작성할 것(else 절대 사용하면 안됨)
 * 2. 모든 금액은 가장 가까운 센트로 반올림할 것
 * 3. 프로그램의 마지막에 한 개의 출력문만 사용하여 결과를 출력할 것
 *
 * 도전 과제
 * 1. 주 이름의 약어를 대소문자가 섞인 상태로 입력해도 되도록 프로그램을 수정해보자
 * 2. 주 이름 전체를 대소문자가 섞인 상태로 입력해도 되도록 프로그램을 수정해보자
 */
public class p14 {

    private static final double TAX = 0.055;
    private static final String SHORT_TARGET_STATE = "WI";
    private static final String FULL_TARGET_STATE = "WISCONSIN";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the order amount? ");
        double amount = ConvertUtil.parseStringToDouble(br.readLine());
        System.out.print("What is the state? ");
        String state = br.readLine();

        if(state == null ) {
            System.out.println("State is null. Please retry");
            return;
        }

        state = state.toUpperCase();
        if(state.equals(SHORT_TARGET_STATE) || state.equals(FULL_TARGET_STATE)) {
            double tax = amount * TAX;
            double total = amount + tax;

            System.out.println("The subtotal is $" + String.format("%.2f", amount) +
                               "\nThe tax is $" + String.format("%.2f",tax) +
                               "\nThe total is $" + String.format("%.2f",total));
            return;
        }

        System.out.println("The total is $" + amount);
    }
}
