import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-02-07.
 *
 * '72의 법칙'은 투자한 금액이 2배가 되기까지 걸리는 시간을 쉽게 계산하는 공식으로,
 * 72를 퍼센트 단위의 복리이자율로 나눈는 것이다.
 * 복리이자를 퍼센트 다위로 받은 다음, 원리금이 총 2배가 되는데까지 걸리는 기간을 계산하는 프로그램을 작성하라.
 * 공식: years = 72/r (r: 연이율)
 *
 * 제약 조건
 * 1. 0을 입력하지 않도록 할 것
 * 2. 숫자가 아닌 값을 입력하지 않도록 할 것
 * 3. 잘못된 입력 값을 처리하는 부분을 루프로 구현하여 유효한 값이 입력될 때까지 반복시킬 것
 *
 * 도전 과제
 *
 * 0을 입력했을 때는 다른 에러 메시지가 나타나도록 프로그램을 수정해보자.
 */
public class p29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the rate of return? ");
        int rate = ConvertUtil.parseStringToInt(br.readLine());

        if(rate == 0) {
            System.out.println("Sorry. The response must be greater than zero.");
            return;
        }

        int res = 72 / rate;
        System.out.println("It will take " + res + " years to double your initial investment");
    }
}
