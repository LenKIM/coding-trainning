import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-17.
 *
 * 세 개의 숫자를 입력 받은 다음,
 * 먼저 세 개의 숫자가 서로 다른지를 확인하여 같은 숫자가 있다면 프로그램을 종료시키고,
 * 그렇지 않은 경우에는 입력한 세 개의 숫자 중 가장 큰 수를 출력시키는 프로그램을 작성하라.
 *
 * 제약 조건
 * 1. 가장 큰 수를 찾기 위해 함수 등을 사용하지 않고 직접 알고리즘을 작성하여 구현할 것
 */
public class p22 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number: ");
        int firstNum = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("Enter the second number: ");
        int secondNum = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("Enter the third number: ");
        int thirdNum = ConvertUtil.parseStringToInt(br.readLine());

        if(isContainEqualCase(firstNum, secondNum, thirdNum)) {
            System.out.println("Same number is included.");
        } else {
            System.out.println("The largest number is " + getLargestNum(firstNum, secondNum, thirdNum));
        }
    }

    private static boolean isContainEqualCase(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    private static int getLargestNum(int a, int b, int c) {
        int result;

        if(a > b && a >c) result = a;
        else if(b > a && b > c) result = b;
        else result = c;

        return result;
    }
}
