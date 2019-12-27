import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 다수의 입력 값으로 금액 계산을 하다 보면 간혹 정확성에 문제가 생기기도 한다.
 * <p>
 * 간단한 셀프계산대 시스템을 만들어 보자.
 * 세 가지 물건의 가격과 수량을 각각 입력 받은 다음 소계를 구하고 소계에 대한 5.5%의 세금을 계산하자.
 * 그리고 물건 종류별 수량과 전체 수량을 출력한 후 가격 소계, 세금, 합계 금액을 출력하자.
 */
public class P10 {

    public static void main(String[] args) {

        final int TOTAL = 3;
        final double TAX_RATE = 0.055;
        int current = 1;
        Scanner sc = new Scanner(System.in);

        List<Long> priceItems = new ArrayList<>();
        List<Long> quantityItems = new ArrayList<>();
        while (current <= TOTAL) {

            System.out.println("Price of item " + current);
            getData(sc, priceItems);

            System.out.println("Quantity of item " + current);
            getData(sc, quantityItems);
            current = current + 1;
        }

        long sum = quantityItems.stream().mapToLong(Long::longValue).sum();
        long totalPrice = priceItems.stream().mapToLong(Long::longValue).sum();
        double tax = totalPrice * TAX_RATE;

        System.out.println("Subtotal: " + sum);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (totalPrice + tax));
    }

    private static void getData(Scanner sc, List<Long> items) {
        while (!sc.hasNextLong()) {
            System.out.println("Confirm your input");
            sc.next();
        }
        long item = sc.nextLong();

        items.add(item);
    }


}
