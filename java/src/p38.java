import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 필터링 값
 * 숫자 리스트를 입력 받고 공백글자로 나누어 저장한 다음 이 중에서 짝수만 들어 있는 새로운 배열을 만들어 출력
 */
public class p38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = Util.promptData("Enter a list of numbers, separated by spaces: ", sc);
        String[] s = data.split(" ");
        System.out.println(filterEvenNumbers(s));
    }

    private static String filterEvenNumbers(String[] s) {
        return Arrays.stream(s)
                .map(Integer::parseInt)
                .filter(a -> (a % 2) == 0)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
