import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SangEun on 2019-12-31.
 *
 * 사용자 로그인 증명을 검증하는 간단한 프로그램을 작성하라.
 * 프로그램은 사용자 이름과 암호를 입력받은 다음, 미리 저장된 사용자 이름에 대한 암호를 비교하여
 * 암호가 일치하면 "Welcome!"을, 그렇지 않으면 "That password is incorrect."를 출력한다.
 *
 * 제약 조건
 * 1. 이 문제를 해결하기 위해 if/else 문을 사용할 것
 * 2. 사용자 이름과 암호는 대소문자를 구별하도록 할 것
 *
 * 도전 과제
 * 1. 암호를 입력할 때 화면에 아무것도 나타나지 않도록 하기 위해서는 어떻게 해야 할지 고민해보자.
 * 2. 사용자 이름과 암호로 구성된 지도(Map)를 만들어 사용자 이름과 암호 조합을 찾도록 하라.
 * 3. 암호를 평문으로 저장하는 대신 비크립트(Bcrypt)를 이용하여 암호화한 다음 저장하자.
 *    그리고는 사용자로부터 입력 받은 암호를 비크립트로 동일하게 암호화한 후 지도에 저장된 암호와 비교하도록 프로그램을 수정해보자.
 */
public class p15 {
    private static Map<String, String> identifierMap = getIdentifierMap();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is your name? ");
        String name= br.readLine();
        System.out.print("What is your password? ");
        String pwd= br.readLine();

        if (name == null || pwd == null) {
            System.out.println("Input is null. Please retry");
        } else if(!verifyName(name.toUpperCase())) {
            System.out.println("Invalid name. Please retry");
        } else if(verifyPassword(name.toUpperCase(), pwd)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("That password is incorrect");
        }
    }

    private static Map<String, String> getIdentifierMap() {
        Map<String, String> map = new HashMap<>();
        map.put("SANGEUN", BCrypt.hashpw("1234", BCrypt.gensalt()));
        map.put("JUNGKYU", BCrypt.hashpw("1234", BCrypt.gensalt()));
        map.put("SUNYOUNG", BCrypt.hashpw("1234", BCrypt.gensalt()));

        return map;
    }

    private static boolean verifyName(String name) {
        return identifierMap.containsKey(name);
    }

    private static boolean verifyPassword(String name, String pwd) {
        return BCrypt.checkpw(pwd, identifierMap.get(name));
    }
}