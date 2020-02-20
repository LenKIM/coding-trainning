import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SangEun on 2020-02-14.
 *
 * 사원 명단이 들어 있는 프로그램을 작성하라.
 * 프로그램이 실행되면 리스트 안에 있는 모든 사원 이름을 출력한 다음,
 * 명단에서 삭제할 이름을 입력 받고 해당하는 이름을 제거한다.
 * 그리고는 나머지 명단을 한 줄씩 출력한다.
 *
 * 제약 조건
 * 이름을 저장하기 위해 배열이나 리스트를 사용할 것
 */
public class p34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> employeeArray = new ArrayList<>();
        employeeArray.add("John Smith");
        employeeArray.add("Jackie Jackson");
        employeeArray.add("Chris Jones");
        employeeArray.add("Amanda Cullen");
        employeeArray.add("Jeremy Goodwin");

        while (employeeArray.size() == 0) {
            System.out.println("There are " + employeeArray.size() + " employees: ");
            for(int i=0; i<=employeeArray.size(); i++) {
                System.out.println(employeeArray.get(i));
            }
            System.out.print("Enter an employee name to remove: ");

            String target = br.readLine();
            if (target != null && !target.equals("") && employeeArray.contains(target)) {
                employeeArray.remove(target);
            } else {
                System.out.print("Input is invalid. Enter an employee name to remove: ");
            }
        }

    }
}
