import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-17.
 *
 * 1부터 12까지의 숫자를 해당하는 달로 변환시키는 프로그램을 만들어보자.
 * 먼저 숫자를 입력받은 다음 이에 해당하는 달 이름을 출력한다.
 * (예:  1은 January, 12는 December)
 * 만일 범위를 넘어서는 숫자를 입력받은 경우 적절한 에러 문구를 출력해보자.
 *
 * 제약 조건
 * switch-case 문을 사용하여 프로그램을 작성할 것
 * 출력문은 한 개만 사용할 것
 */
public class p21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the number of the month: ");
        int month = ConvertUtil.parseStringToInt(br.readLine());

        String monthStr;

        switch (month) {
            case 1 : monthStr = "January"; break;
            case 2 : monthStr = "February"; break;
            case 3 : monthStr = "March"; break;
            case 4 : monthStr = "April"; break;
            case 5 : monthStr = "May"; break;
            case 6 : monthStr = "June"; break;
            case 7 : monthStr = "July"; break;
            case 8 : monthStr = "August"; break;
            case 9 : monthStr = "September"; break;
            case 10 : monthStr = "October"; break;
            case 11 : monthStr = "November"; break;
            case 12 : monthStr = "December"; break;
            default: System.out.println("Input number is not included in the month."); return;
        }

        System.out.println("The name of the month is " + monthStr);
    }
}
