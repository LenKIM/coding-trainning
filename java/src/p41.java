import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

/**
 * 이름 정렬
 * 파일의 내용을 알파벳순으로 정렬하는 것은 프로그램이 파일을 다루기 편리하게 만드는방법
 */
public class p41 {

    public static void main(String[] args) {

        try {
            List<String> strings = Files.readAllLines(Paths.get("/Users/lenkim/toy-project/coding-trainning/java/src/texture/p41.txt"));
            strings.sort(String::compareTo);

            strings.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
