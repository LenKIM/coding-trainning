import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SangEun on 2020-01-31.
 *
 * 이름과 성, 사번, 우편번호를 입력받은 다음, 다음과 같은 규칙에 맞는지를 점검하는 프로그램을 작성하라.
 *
 * 이름은 반드시 넣어야 한다.
 * 성은 반드시 넣어야 한다.
 * 이름과 성은 최소한 두 글자 이상이어야 한다.
 * 사번은 AA-1234의 형태가 되어야 한다. 즉, 두 글자의 알파벳, 하이픈, 4자리 숫자로 구성되어야 한다.
 * 우편번호는 반드시 숫자여야 한다.
 * 잘못된 데이터가 입력되면 적절한 에러 메시지를 출력해야 한다.
 *
 * 제약 조건
 * 1. 입력 데이터를 검증하는 함수를 각각 만들고, validateInput 함수를 만들어
 *    모든 입력 데이터를 인수로 받은 다음 각각의 경우마다 별도로 만든 입력 데이터 검증 함수들을 호출하여
 *    입력 값을 검증하도록 구현할 것
 * 2. 결과를 출력하는 출력문은 한 개만 사용할 것
 */
public class p27 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first name: ");
        String firstName = br.readLine();
        System.out.print("Enter the last name: ");
        String lastName = br.readLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = br.readLine();
        System.out.print("Enter an employee ID: ");
        String employeeId = br.readLine();

        if(validateInput(firstName, lastName, zipCode, employeeId)) {
            System.out.println("There were no errors found.");
        }
    }

    private static boolean validateInput(String firstName, String lastName, String zipCode, String employeeId) {
        return validateName(firstName) && validateName(lastName) && validateZipCode(zipCode) && validateEmployeeId(employeeId);
    }

    private static boolean validateName(String name) {
        if(name.length() > 2) {
            return true;
        } else if(name.length() == 0) {
            System.out.println("The last name must be filled in");
            return false;
        } else {
            System.out.println("The name must be at least two characters long.");
            return false;
        }
    }

    private static boolean validateZipCode(String code) {
        int num;
        try {
            num = Integer.parseInt(code);
        } catch (NumberFormatException e) {
            System.out.println("The ZIP code must be numeric.");
            return false;
        } catch (NullPointerException e) {
            return true;
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
            return false;
        }
        return true;
    }

    private static boolean validateEmployeeId(String id) {
        //사번은 AA-1234의 형태가 되어야 한다. 즉, 두 글자의 알파벳, 하이픈, 4자리 숫자로 구성되어야 한다.
        String pwPattern = "^[A-Z]{2}-\\d{4}$";
        Matcher matcher = Pattern.compile(pwPattern).matcher(id);

        if(matcher.matches()) {
            return true;
        } else {
            System.out.println(id + "is not a valid ID");
            return false;
        }
    }
}
