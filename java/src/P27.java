import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 입력 값 검증
 * 대규모 함수는 사용하기도 어렵고 관리하는 것도 쉽지 않다.
 * 그래서 로직을 나누어 여러 개의 작은 함수로 구성하는 것이 휠씬 좋다.
 * 프로그램은 이렇게 만들어진 함수들을 차례로 호출하기만 하면 된다.
 *  이름과 성, 사번, 우편번호를 입력 받은 다음, 다음과 같은 규칙에 맞는지를 점검하는 프로그램 작성
 */
public class P27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameValidatorRegex = "([A-Z|a-z]{2,})";
        String zipCodeValidatorRegex = "([0-9]{5})";
        String employeeValidatorRegex = "([A-Z]{2})(-[0-9]{4})";

        Pattern namePattern = Pattern.compile(nameValidatorRegex);
        Pattern zipCodePattern = Pattern.compile(zipCodeValidatorRegex);
        Pattern employeePattern = Pattern.compile(employeeValidatorRegex);

        String firstName = Util.promptData("Enter the first name: ", sc);
        String lastName = Util.promptData("Enter the last name: ", sc);
        String zipCode = Util.promptData("Enter the ZIP code: ", sc);
        String employeeId = Util.promptData("Enter an employee ID: ", sc);


        Matcher firstNameMatcher = namePattern.matcher(firstName);
        Matcher lastNameMatcher = namePattern.matcher(lastName);
        Matcher zipCodeMatcher = zipCodePattern.matcher(zipCode);
        Matcher employeeIdMatcher = employeePattern.matcher(employeeId);

        boolean isValidFirstName = firstNameMatcher.matches();
        boolean isValidLastName = lastNameMatcher.matches();
        boolean isValidZipCode = zipCodeMatcher.matches();
        boolean isValidEmployeeId = employeeIdMatcher.matches();
        if (isValidFirstName &&
                isValidLastName &&
                isValidZipCode &&
                isValidEmployeeId){
            System.out.println("There were no errors found");
        }

        if (firstName.length() <= 1){
            System.out.println(firstName + " is not a valid first name. It is too short" );
        }

        if (lastName.length() == 0){
            System.out.println("The last name must be filled in.");
        }

        if (!isValidLastName){
            System.out.println(lastName + " is not a valid first name.");
        }

        if (!isValidZipCode){
            System.out.println(zipCode + " is not a valid Zipcode");
        }

        if (!isValidEmployeeId){
            System.out.println(employeeId + " is not a valid EmployeeId");
        }
    }
}
