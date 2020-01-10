import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-10.
 *
 * 몸무게, 성별, 음주량(잔 수), 마신 술에 해당하는 알코올량, 경과 시간을 받은 다음 식을 이용하여
 * 혈중 알코올 농도(BAC)를 구하는 프로그램을 작성하라.
 *
 * BAC = (A*5.14/W*r) - 0.015*H
 * A: 총 알코올 소비량(온스)
 * W: 몸무게(파운드)
 * r: 성별에 따른 알코올 흡수비 계수(남:0.74, 여:0.6)
 * H: 술을 마신 후 경과시간
 *
 * (미국에서) 법적으로 운전 가능한 BAC 값인 0.08 미만인지를 비교하여 운전 가능 여부를 출력해보자.
 *
 * 제약 사항
 * 1. 숫자 값에 숫자가 입력되도록 보장할 것
 *
 */
public class p17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your weight? ");
        double weight = ConvertUtil.parseStringToDouble(br.readLine());

        System.out.print("What is your gender?(M/W) ");
        double ratio;
        switch (br.readLine().toUpperCase()) {
            case "M" :
                ratio = 0.74;
                break;
            case "W" :
                ratio = 0.6;
                break;
            default :
                System.out.println("Wrong input");
                return;
        }

        System.out.print("How many drinks did you drink? ");
        int amount = ConvertUtil.parseStringToInt(br.readLine());

        System.out.print("How long have you been drinking? ");
        int hour = ConvertUtil.parseStringToInt(br.readLine());


        double BAC = (amount * 5.14 / weight * ratio) - 0.015 * hour;
        System.out.println("Your BAC is " + BAC);
        Boolean isLegal = BAC < 0.08;

        if(isLegal) {
            System.out.println("It is legal for you to drive");
        } else {
            System.out.println("It is not legal for you to drive");
        }
    }
}
