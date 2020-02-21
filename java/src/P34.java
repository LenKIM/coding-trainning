import java.util.Arrays;
import java.util.Scanner;

/**
 * 사원 명단 삭제
 * 특정 조건에 따라 리스트에 있는 내용을 지정하거나 삭제해야 하는 경우가 생긴다.
 * 마치 더 이상 사용하지 않을 카드를 카드뭉치에서 꺼내는 것처럼, 유효한 입력 값들이 들어 있는 리스트에서 이미 사용된 값을
 * 제거할 수도 있는 것이다. 배열에 데이터를 저장하면 이러한 작업이 쉬워진다. 사용하는 언어에 따라 다르지만 기존의 자료 구조를 수정하는 거솝다.
 */
public class P34 {

    public static void main(String[] args) {
//        5명 근로자
        Scanner sc = new Scanner(System.in);
        String[] employees = {"Jone", "Jeong gyu", "Dami", "Gaon", "Sunny"};

        System.out.println("There is 5 employees");
        Arrays.stream(employees).forEach(System.out::println);

        String s = Util.promptData("Who do you want to remove from list? ", sc);

        if (!Arrays.asList(employees).contains(s)) {
            System.out.println("Not Matched anyone");
            return;
        }
        Arrays.stream(employees).filter(a -> a.equals(s)).forEach(System.out::println);


    }
}
