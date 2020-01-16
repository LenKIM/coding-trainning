import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SangEun on 2019-12-31.
 *
 * 나이를 입력 받아 미국법상 운전 가능한 나이인 16세와 비교하여
 * 16 이상이면 "You are old enough to legally drive."라고 출력하고,
 * 16 미만이면 "You are not old enough to legally drive."라고 출력하는 프로그램을 작성하라.
 *
 * 제약 사항
 * 1. 한 개의 출력문만 사용할 것
 * 2. 3항 연산자를 사용할 것.
 *    사용하는 프로그래밍 언어가 3항 연산자를 지원하지 않는다면 일반적인 if/else 문을 사용할 것.
 *    하지만 여전히 메시지를 출력하는 출력문은 한 개만 사용할 것
 *
 * 도전 과제
 * 1. 0보다 작은 값을 입력하거나 숫자가 아닌 값을 입력하면 올바른 나이를 입력하라는 에러 메시지를 출력해보자.
 * 2. 프로그램 로직에 운전 가능한 나이를 코드 안에 넣는 대신
 *    나라별 운전 가능한 연령을 조사하여 테이블로 구성한 다음,
 *    나이와 국가를 입력 받아 해당 국가에서 운전을 할 수 있는지를 출력하도록 프로그램을 수정해보자.
 */
public class p16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map driverMap = getDriverMap();

        System.out.print("Where do you live? ");
        String country = br.readLine().toUpperCase();
        if(country.isEmpty()) {
            System.out.println("You have to write your country.");
            return;
        }

        System.out.print("What is your age? ");
        int age = ConvertUtil.parseStringToInt(br.readLine());
        if(age < 0) {
            System.out.println("Age must be greater than zero.");
            return;
        }

        String msg;
        if(driverMap.containsKey(country)) {
            msg = (int) driverMap.get(country) >= age ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        } else {
            msg = "I don't know the laws about your country.";
        }

        System.out.println(msg);
    }

    private static Map<String, Integer> getDriverMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("FRANCE", 18);
        map.put("ENGLAND", 17);
        map.put("GERMANY", 17);
        map.put("CHINA", 18);
        map.put("NEWZEALAND", 16);
        map.put("KOREA", 18);

        return map;
    }
}
