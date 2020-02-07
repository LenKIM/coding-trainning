import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-02-07.
 *
 * 나이와 평상시의 심박수를 입력 받은 다음 카르보넨 공식을 사용하여
 * 최대 심박수의 55% 에서 95%에 해당하는 심박수를 구하는 프로그램을 작성하라.
 * 이때, 출력예와 같이 표 형태로 출력해야 한다.
 *
 * 공식: TargetHeartRate = (((220 - age) - restingHR) * intensity) + restingHR
 *
 * 제약 조건
 * 1. 퍼센트를 하드코딩하지 말 것. 대신 루프를 사용하여 퍼센트를 55에서 95까지 증가하게 할 것
 * 2. 나이와 심박수는 숫자로만 받을 수 있도록 하여 숫자가 입력될 때까지 진행되지 않도록 할 것
 * 3. 결과는 표 형태로 출력할 것
 */
public class p31 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Resting Pulse: ");
        int restingPulse = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("Age: ");
        int age = ConvertUtil.parseStringToInt(br.readLine());

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------------");

        for(int i = 55; i < 96; i++) {
            int bpm = (((220 - age) - restingPulse) * i / 100) + restingPulse;
            System.out.println(i + "%           | " + bpm + "bpm");
        }
    }
}
