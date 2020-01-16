import java.util.Objects;
import java.util.Scanner;

/**
 * 암호 검증
 * 암호는 미리 저장한 값과 사용자가 입력한 값을 비교하는 것으로 검증.
 * 사용자 로그인 증명을 검증하는 간단한 프로그램 작성
 */
public class P15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hiddenPassword = "daou";

        System.out.println("What is the password: ");
        String password = sc.next();

        if (Objects.equals(hiddenPassword.hashCode(), password.hashCode())) {
            System.out.println("Welcome");
        } else {
            System.out.println("That password is incorrect.");
        }
    }
}
