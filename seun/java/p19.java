import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-10.
 *
 * 사용자로부터 사람의 키(인치 단위), 몸무게(파운드 단위)를 입력받아
 * 체질량 지수(BMI, Body Mass Index)를 계산하는 프로그램을 작성하라.
 *
 * bmi = (weight / (height*height)) * 703
 *
 * BMI 값이 18.5에서 25 사이로 나타나면 이 사람은 정상적인 몸무게라고 출력하고,
 * 그렇지 않은 경우에는 과체중이나 저체중으로 나타낸 다음 의사와 상의하라는 문구도 출력해보자.
 *
 * 제약 사항
 * 1. 입력 값으로 숫자만 받을 수 있도록 하여 숫자가 입력될 때까지 진행되지 않도록 할 것
 *
 */
public class p19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your height? ");
        double height = ConvertUtil.parseStringToInt(br.readLine());

        System.out.print("What is your weight? ");
        double weight = ConvertUtil.parseStringToInt(br.readLine());

        double bmi = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + bmi);
        if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else if (18.5 <= bmi && bmi <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}
