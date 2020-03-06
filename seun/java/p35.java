import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by SangEun on 2020-02-21.
 *
 * 대회 또는 그리기 대회의 수상자를 선택하는 프로그램을 작성하라.
 * 프로그램은 아무것도 입력하지 않을 때까지 대회 참가자 이름을 입력 받은 다음 이 중에서 무작위로 수상자를 선정한다.
 *
 * 제약 조건
 * 1. 사용자 입력을 배열에 저장하는 부분을 루프로 구현할 것
 * 2. 배열에 잇는 값을 선택하기 위해 무작위 숫자 생성기를 사용할 것
 * 3. 빈 이름은 배열에 추가하지 말 것
 * 4. 어떤 언어는 미리 배열 크기를 정의하도록 요구하기도 하는데, 이러 ㄹ경우에는 ArrayList 같은 다른 자료구조를 찾아볼 것
 */
public class p35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> participants = new ArrayList<>();

        System.out.print("Enter a name: ");
        String res;
        while (!"".equals((res = br.readLine()))) {
            participants.add(res);
            System.out.print("Enter a name: ");
        }

        if(participants.size() > 0) {
            int randomNum = getRandomNumber(participants.size());
            System.out.println("The winner is... " + participants.get(randomNum));
        } else {
            System.out.println("There are no participants.");
        }
    }

    private static int getRandomNumber(int max) {
        Random r = new Random();
        return r.nextInt(((max) + 1));
    }
}
