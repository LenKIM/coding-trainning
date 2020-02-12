import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 72의 법칙 은 투자한 금액이 2배가 되기까지 걸리는 시간을 쉽게 계산하는 공식으로,
 * 72를 퍼센트 단위의 복리이자율로 나누는 것이다. 이 법칙은 주식, 채권, 적금 등의
 * 투자를 선택할 때 아주 좋은 도구로 활용 될 수 있다. 또한 잘못된 입력을 검출하기 위해 작성하는 프로그램으로서도 좋다.
 * 왜냐하면 컴퓨터는 0으로 나누는 연산을 할 수 없기 때문이다. 그래서 잘못된 입력에 의해 예기치 못하게 프로그램이
 * 종료되도록 하는 것보다는 이러한 상황을 무시하고 유효한 값을 받을 때까지 입력을 받도록 할 수 있다.
 *
 *  복리이자를 퍼센트 단위로 받은 다음, 원리금이 총 2배가 되는데까지 걸리는 시간을 계산하는 프로그램을 작성하라.
 *  years = 72/r
 *  r: 연이율
 */
public class P29 {
    public static void main(String[] args) {

        final String message = "What is the rate of return?";
        final String np = "Sorry. That's not a valid input.";

        Scanner sc = new Scanner(System.in);
        String validPattern = "([0-9]).*";
        Pattern pattern = Pattern.compile(validPattern);
        boolean isNotEnd = true;
        while (isNotEnd){
            String input = Util.promptData(message, sc);
            Matcher matcher = pattern.matcher(input);
            if (!matcher.matches() || Integer.parseInt(input) == 0 || Integer.parseInt(input) > 72){
                System.out.println(np);
                isNotEnd = false;
                continue;
            }
            int i = 72 / Integer.parseInt(input);
            System.out.println("It will take " + i + " years to double your initial investment");
        }
    }
}
