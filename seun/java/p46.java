import java.io.*;
import java.util.*;

public class p46 {
    /**
     * Created by SangEun on 2020-03-06.
     * 파일을 읽은 다음 파일에서 사용된 단어의 빈도를 세는 프로그램을 작성하라.
     * 단어의 빈도를 측정한 후에는 단어와 빈도를 히스토그램 형태로 화면에 나타내보자.
     */
    public static void main(String[] args) throws IOException {
        Map<String, Integer> words = new HashMap<>();
        File resourceFile = new File("res/Words");
        BufferedReader br = new BufferedReader(new FileReader(resourceFile));

        String line;
        StringBuilder s = new StringBuilder();
        while ((line = br.readLine()) != null) {
            s.append(line).append(" ");
        }
        String[] contents = s.toString().split(" ");
        Arrays.sort(contents);

        String temp = null;
        int count = 0;
        for (String content : contents) {
            if (!content.equals(temp)) {
                if (temp != null) {
                    words.put(temp, count);
                }
                temp = content;
                count = 0;
            }
            count++;
        }
        words.put(temp, count);

        for(Map.Entry<String, Integer> elem : words.entrySet()){
            String key = elem.getKey();
            int value = elem.getValue();

            System.out.print(String.format("%-10s: ", key));
            for (int i = 0; i < value; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
