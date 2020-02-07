import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2020-02-07.
 *
 * 0부터 12까지의 곱셈표를 만드는 프로그램을 작성하라.
 *
 * 제약 조건
 * 중첩된 루프를 사용할 것
 */
public class p30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 13; i++) {
            for(int j = 0; j < 13; j++) {
                System.out.println(i + " x " + j  + " = " + i * j);
            }
        }
    }
}
