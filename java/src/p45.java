import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 입력 파일을 제공받고 파일을 읽은 다음 'utilize' 라는 단어가 얼마나 나오는지를 확인한다.
 * utilize를 use로 바꾸고 새로운 파일에 변경된 내용을 저장하는 프로그램을 작성하라.
 *
 * 제약 조건
 * 1. 출력 파일 이름을 입력 받도록 구현할 것
 * 2. 새로운 파일에 결과를 작성할 것
 */
public class p45 {

    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("texture/p45"));

        String collect = strings.stream().map(
                line -> line.replace("utilize", "use")
        ).collect(Collectors.joining());

        String fileName = "my_file.txt";
        FileWriter writer = new FileWriter(fileName);
        writer.write(collect);
        writer.close();
    }
}
