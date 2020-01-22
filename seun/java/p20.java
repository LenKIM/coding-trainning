import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-17.
 *
 * 여러 주와 하나의 주 내에 있는 카운티에 따라 달라지는 세금 계산기를 작성하라.
 * 주문 가격을 입력 받고 주문할 주를 입력 받는다.
 * 위스콘신 주의 경우에는 카운티를 추가로 입력받는다.
 *
 * Eau Claire 카운티의 경우 추가로 0.005의 세금을 더한다.
 * Dunn 카운티의 경우 추가로 0.004의 세금을 더한다.
 *
 * 일리노이 주의 경우에는 8%의 세금을 부과하며 카운티 세금은 부과하지 않는다.
 * 나머지 다른 주는 세금을 받지 않는다.
 *
 * 위스콘신과 일리노이 주에 대해서는 세금과 세금이 포함된 총 금액을 출력하고,
 * 나머지 주에 대해서는 세금이 포함된 총 금액만 출력한다.
 *
 * 제약조건
 * 1. 모든 금액은 가까운 센트로 반올림시킬 것
 * 2. 프로그램의 마지막에 한 개의 출력문만 사용하여 결과를 출력할 것
 */
public class p20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";

        System.out.print("What is the order amount? ");
        double amount = ConvertUtil.parseStringToDouble(br.readLine());

        System.out.print("What state do you live in? ");
        String state = br.readLine();

        if(state.equalsIgnoreCase("WISCONSIN")) {
            System.out.print("What county do you live in? ");
            String county = br.readLine();
            if("Eau Claire".equalsIgnoreCase(county)) {
                double countyTax = amount * 0.005;
                result = String.format("%.2f", amount + countyTax);
                System.out.println("The county tax is " + countyTax);
            } else if("Dunn".equalsIgnoreCase(county)) {
                double countyTax = amount * 0.004;
                result = String.format("%.2f", amount + countyTax);
                System.out.println("The county tax is " + countyTax);
            }
        } else if(state.equalsIgnoreCase("ILLINOIS")) {
            double stateTax = amount * 0.008;
            result = String.format("%.2f", amount + stateTax);
            System.out.println("The state tax is " + stateTax);
        } else result = String.format("%.2f", amount);

        System.out.println("The total is " + result);
    }
}
