import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 승자 선택
 * 사용자 입력을 배열에 저장한 다음 그것을 사용.
 * 프로그램은 아무것도 입력하지 않을 때까지 대회 참가자 이름을 입력받은 다음 이 중에서 무작귀로 수상자 선정
 */
public class P35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isEnd = true;
        int count = 0;
        List<String> names = new ArrayList<>();
        while (isEnd){
            count =  count + 1;
            String s = sc.nextLine();
            names.add(s);
            if (s.isEmpty()){
                isEnd = false;
            }
        }

        int i = new Random().nextInt(names.size()-1);
        System.out.println("The Winner is... " + names.get(i));

    }
}
