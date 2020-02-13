import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-01-22.
 *
 * 자동차에 대한 문제를 해결하는 프로그램을 작성하라.
 * 제시된 의사 결정 트리를 이용한다.
 *
 * 제약조건
 * 한 번에 모든 입력을 받지 말고 상황과 답변에 맞는 질문이 나타나도록 할 것
 */
public class p23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("열쇠를 꽂고 돌렸을 때 차가 조용한가?(Y/N)");
        String answer = br.readLine();

        if(checkAnswer(answer)) {
            System.out.print("배터리 단자가 부식되었는가?(Y/N)");
            answer = br.readLine();

            if(checkAnswer(answer)) {
                System.out.println("단자를 개끗하게 하고 다시 시도하라");
            } else {
                System.out.println("케이블을 교체하고 다시 시도하라");
            }
        } else {
            System.out.print("차에서 달깍거리는 소리가 나는가?(Y/N)");
            answer = br.readLine();

            if(checkAnswer(answer)) {
                System.out.println("배터리를 교체하고 다시 시도하라");
            } else {
                System.out.print("시동이 완전히 걸리지 않는가?(Y/N)");
                answer = br.readLine();

                if(checkAnswer(answer)) {
                    System.out.println("점화플러그 연결 상태를 점검하라");
                } else {
                    System.out.print("엔진이 동작한 후 바로 꺼지는가?(Y/N)");
                    answer = br.readLine();

                    if(checkAnswer(answer)) {
                        System.out.print("차에 연료 분사 장치가 있는가?(Y/N)");
                        answer = br.readLine();

                        if(checkAnswer(answer)) {
                            System.out.println("초크가 제대로 여닫아지는지 확인하라");
                        } else {
                            System.out.println("서비스센터에 의뢰하라");
                        }
                    } else {
                        System.out.println("서비스센터에 의뢰하라");
                    }
                }
            }
        }
    }

    private static boolean checkAnswer(String answer) {
        if(answer.equalsIgnoreCase("Y")) {
            return true;
        } else if(answer.equalsIgnoreCase("N")) {
            return false;
        } else {
            System.out.println("Format error. Please retry.");
            System.exit(0);
            return false;
        }
    }
}
