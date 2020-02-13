import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-10.
 *
 * 화씨온도와 섭씨온도를 서로 변환시키는 프로그램을 작성하라.
 * 변환할 타입을 입력받은 다음 온도를 입력 받아 해당 타입으로 변환시키자.
 *
 * C = (F - 32) * 5 / 9
 * F = (C * 9 / 5) + 32
 *
 * 제약 사항
 * 1. C와 F는 대소문자에 관계없이 입력 받을 수 있도록 할 것
 * 2. 출력문의 개수를 최소화하면서도 출력 문자열을 반복해서 사용하지 않도록 할 것
 *
 */
public class p18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isC = false;

        System.out.println("Press C to convert from Fahrenheit to Celsius. ");
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        System.out.print("Your choice: ");

        switch (br.readLine().toUpperCase()) {
            case "C" :
                isC = true;
                break;
            case "F" :
                break;
            default :
                System.out.println("Wrong input. Please retry.");
                return;
        }

        if(isC) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int fahrenheit = ConvertUtil.parseStringToInt(br.readLine());
            System.out.println("The temperature in Celsius " + (fahrenheit - 32) * 5 / 9);
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            int celsius = ConvertUtil.parseStringToInt(br.readLine());
            System.out.println("The temperature in Fahrenheit " + (celsius * 9 / 5) + 32);
        }
    }
}
