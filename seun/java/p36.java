import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by SangEun on 2020-02-21.
 *
 * 웹사이트의 응답시간을 밀리초로 받는 프로그램을 작성하라.
 * 사용자가 'done'이라고 입력할 때까지 응답시간을 받는다.
 * 그 다음 평균 응답시간, 최소 응답시간, 최대 응답시간, 표준편차를 출력하자.
 * 평균 값을 구하는 방법은 다음과 같다.
 * 1. 모든 값의 합계를 구한다.
 * 2. 합계를 값의 개수로 나눈다.
 * 표준편차를 구하는 방법은 다음과 같다.
 * 1. 각각의 값과 평균의 차를 구하고 이를 제곱한다.
 * 2. 제곱한 값들의 평균을 구한다.
 * 3. 이 평균에 루트를 씌운다.
 *
 * 제약 조건
 * 1. 입력 부분과 계산 부분을 사용하기 위해 루프와 배열을 이용할 것
 * 2. 배열에는 done 값을 넣으면 안 됨
 * 3. 숫자를 문자열로 변환시킬 것
 * 4. 입력 부분은 처리 부분, 출력 부분과 분리시킬 것
 */
public class p36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.print("Enter a number: ");
            String res = br.readLine();
            if("done".equals(res)) {
                flag = false;
            } else if(ConvertUtil.isValidStringToInt(res)) {
                nums.add(ConvertUtil.parseStringToInt(res));
            } else {
                System.out.println("Invalid input. retry.");
            }
        }

        int listSize = nums.size();
        if(listSize > 0) {
            int sum = 0;

            System.out.print("Numbers: ");
            for (Integer num : nums) {
                sum += num;
                System.out.print(num + " ");
            }

            double average = sum / listSize;
            Arrays.sort(nums.toArray());

            System.out.println("\nThe average is " + average);
            System.out.println("The minimum is " + nums.get(0));
            System.out.println("The maximum is " + nums.get(listSize - 1));
            System.out.println("The standard deviation is " + getStandardDeviation(nums, average));
        } else {
            System.out.println("There are no numbers.");
        }
    }

    private static double getStandardDeviation(List<Integer> nums, double average) {
        int sum = 0;
        for (Integer num : nums) {
            sum += Math.pow(num - average, 2);
        }

        return Math.sqrt(sum / nums.size());

    }
}
