import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SangEun on 2020-01-22.
 *
 * 주어진 암호의 복잡도를 결정하는 프로그램을 작성하라. 복잡도는 다음과 같은 규칙으로 작성한다.
 *
 * 아주 약한 암호는 숫자로만 구성되고 길이도 8글자 미만임
 * 약한 암호는 영문자로만 구성되고 길이도 8글자 미만임
 * 강한 암호는 영문자와 한 개 이상의 숫자로 구성되어 있으며 길이는 8글자 이상임
 * 아주 강한 암호는 영문자, 숫자, 특수문자로 구성되어 있으며 길이는 8글자 이상임
 *
 * 제약 조건
 * 1. 암호를 인수로 받은 다음 암호의 복잡도를 알 수 있는 값을 반환하는 passwordValidator 함수를 작성할 것.
 *    이 때 passwordValidator 함수는 문자열을 반환해서는 안 된다.
 *    왜냐하면 나중에 다국어를 지원하는 경우가 생길 수도 있기 때문이다.
 * 2. 한 개의 출력문만 사용할 것
 */
public class p25 {
    public static final int INVALID_VALUE = 0;
    public static final int VERY_WEAK = 1;
    public static final int WEAK = 2;
    public static final int STRONG = 3;
    public static final int VERY_STRONOG = 4;
    private static String inputPwd;

    public static void main(String[] args) throws IOException {
        int result = passwordValidator();

        switch (result) {
            case INVALID_VALUE:
                System.out.println("Invalid password");
                break;
            case VERY_WEAK:
                System.out.println("The password '" + inputPwd + "' is a very weak password");
                break;
            case WEAK:
                System.out.println("The password '" + inputPwd + "' is a weak password");
                break;
            case STRONG:
                System.out.println("The password '" + inputPwd + "' is a strong password");
                break;
            case VERY_STRONOG:
                System.out.println("The password '" + inputPwd + "' is a very strong password");
                break;
        }
    }

    private static int passwordValidator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please input your password: ");
        inputPwd = br.readLine();

        if(inputPwd.isEmpty()) {
            return 0;
        } else if (isVeryStrongPwd(inputPwd)) {
            return VERY_STRONOG;
        } else if (isStrongPwd(inputPwd)) {
            return STRONG;
        } else if (isWeakPwd(inputPwd)) {
            return WEAK;
        } else {
            return VERY_WEAK;
        }

    }

    private static boolean isWeakPwd(String input) {
        String pwPattern = "^(?=.*[A-Za-z])[A-Za-z]{8,}$";
        Matcher matcher = Pattern.compile(pwPattern).matcher(input);
        return matcher.matches();
    }

    private static boolean isStrongPwd(String input) {
        String pwPattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Matcher matcher = Pattern.compile(pwPattern).matcher(input);
        return matcher.matches();
    }

    private static boolean isVeryStrongPwd(String input) {
        String pwPattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$";
        Matcher matcher = Pattern.compile(pwPattern).matcher(input);
        return matcher.matches();
    }
}
