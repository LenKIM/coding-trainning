import java.io.*;

public class p45 {
    /**
     * Created by SangEun on 2020-03-06.
     * 입력 파일을 제공받고 파일을 읽은 다음 'utilize' 라는 단어가 얼마나 나오는지를 확인한다.
     * utilize를 use로 바꾸고 새로운 파일에 변경된 내용을 저장하는 프로그램을 작성하라.
     *
     * 제약 조건
     * 1. 출력 파일 이름을 입력 받도록 구현할 것
     * 2. 새로운 파일에 결과를 작성할 것
     */
    public static void main(String[] args) throws IOException {
        StringBuilder content = new StringBuilder();
        File resourceFile = new File("res/Utilize");

        BufferedReader br = new BufferedReader(new FileReader(resourceFile));

        String line;
        while ((line = br.readLine()) != null) {
            String newLine = line.replace("utilize", "use");
            content.append(newLine).append("\n");
        }

        System.out.println(content.toString());

        File file = new File("output/WordChangeResult.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        bw.write(String.valueOf(content));
        bw.close();
    }
}
