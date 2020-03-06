import java.io.*;
import java.util.*;

/**
 * Created by SangEun on 2020-03-06.
 * 콤마로 구분되어 있는 내용이 들어 있는 파일을 정렬된 표 형식으로 출력하라
 *
 * Last First Salary
 * Ling, Mai, 55900
 * Johnson, Jim, 56500
 * Jones, Chris, 34500
 * Swift, Geoffrey, 14200
 * Xiong, Fong, 65000
 * Zarnecki, Sabrina, 51500
 *
 * 제약 조건
 * 1. 데이터를 파싱하기 위해 CSV 파서를 사용하지 말고 자신마의 코드를 작성하여 사용할 것
 * 2. 컬럼의 줄을 맞추기 위해 공백 글자를 사용할 것
 * 3. 컬럼의 길이는 가장 긴 값에 해당하는 글자보다 한 글자 길게 정할 것
 */

public class p42 {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> users = new ArrayList<>();
        File resourceFile = new File("res/CommaList");

        BufferedReader br = new BufferedReader(new FileReader(resourceFile));

        String line;
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");

            Map<String, String> temp = new HashMap<>();
            temp.put("Last", info[0]);
            temp.put("First", info[1]);
            temp.put("Salary", info[2]);

            users.add(temp);
        }

        File file = new File("output/UserListResult.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        String info = "Total of " + users.size() + " names";
        String divider = "------------------";


        bw.write(String.format("%-10s %-10s %-10s", "Last", "First", "Salary"));
        bw.newLine();
        bw.write("---------------------------------");
        bw.newLine();

        users.forEach((user)-> {
            try {
                bw.write(String.format("%-10s%-10s%-10s", user.get("Last"), user.get("First"), user.get("Salary")));
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bw.close();
    }
}
