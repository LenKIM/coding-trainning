import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * 데이터 파일 파싱
 * CSV 파일을 이쁘게 표현하기.
 */
public class p42 {

    public static void main(String[] args) throws IOException {

        List<String> data = Files.readAllLines(Paths.get("/Users/lenkim/toy-project/coding-trainning/java/src/texture/p42.txt"));
        data.stream().map(
                line -> {
                    String[] split = line.split(",");
                    String first = split[1];
                    String last = split[0];
                    String salary = split[2];
                    return new Person(first, last, salary);
                }
        ).forEach(a -> System.out.println(a.toString()));
    }

    static class Person {
        private final String first;
        private final String last;
        private final String salary;

        public Person(String first, String last, String salary) {
            this.first = first;
            this.last = last;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return first + "  " + last + "  " + salary;
        }
    }

}
