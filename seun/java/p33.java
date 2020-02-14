import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by SangEun on 2020-02-14.
 *
 * Magic 8 ball 게임을 작성하라.
 * 사용자로부터 질문을 입력받아 이에 대한 답을 "Yes", "No", "Maybe", "Ask again later" 등 중에서 무작위로 대답해주는 게임이다.
 *
 * 제약 조건
 * 1. 대답하는 값은 pseudo 무작위 숫자 생성기를 이용하여 섯택되도록 할 것
 * 2. 선택지는 배열에 넣은 다음 무작위로 한 개가 선택되도록 한다.
 */
public class p33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] resArray = {"Yes", "No", "Maybe", "Ask again later"};

        System.out.print("What's your question? ");
        br.readLine();

        System.out.println(resArray[getRandomNumber(resArray.length)]);
    }

    private static int getRandomNumber(int max) {
        Random r = new Random();
        return r.nextInt(((max) + 1));
    }
}
