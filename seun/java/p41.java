import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by SangEun on 2020-03-06.
 * 이름 리스트가 저장된 파일을 읽는 프로그램을 작성하라.
 *
 * 앞의 리스트를 읽은 다음 알파벳 순으로 정렬하라.
 * 그런 다음 정렬된 리스트를 출력 예와 같은 형태로 파일에 저장하라
 *
 * Total of 7 names
 * ----------------
 * List
 *
 * 제약 조건
 * - 이름 개수를 하드코딩하지 말 것
 */

public class p41 {
    public static void main(String[] args) throws IOException {
        List<String> resultList = new ArrayList<>();
        File resourceFile = new File("res/NameList");

        BufferedReader br = new BufferedReader(new FileReader(resourceFile));

        String line;
        while ((line = br.readLine()) != null) {
            resultList.add(line);
        }

        Collections.sort(resultList);

        File file = new File("output/NameListResult.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        bw.write("Total of \" + resultList.size() + \" names");
        bw.newLine();
        bw.write("------------------");
        bw.newLine();

        resultList.forEach((name)-> {
            try {
                bw.write(name);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bw.close();
    }
}
