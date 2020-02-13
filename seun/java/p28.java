import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-31.
 *
 * 다섯 개의 숫자를 입력 받은 다음 입력 받은 수의 합을 계산하는 프로그램을 작성하라.
 *
 * 제약 조건
 * 1. 숫자를 입력 받는 부분은 다섯 개의 입력문 대신 개수가 제한된 루프와 같은 반복문으로 구현할 것
 * 2. 프로그램을 작성하기 전에 순서도를 그릴 것
 */
public class p28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;

        for (int i = 0; i < 5; i ++) {
            System.out.print("Enter a number: ");
            int num = ConvertUtil.parseStringToInt(br.readLine());
            total = total + num;
        }

        System.out.println("The total is " + total);
    }
}
