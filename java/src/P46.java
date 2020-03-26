import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by joenggyu0@gmail.com on 3/20/20
 * Github : http://github.com/lenkim
 */

public class P46 {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("java/src/texture/p46.txt"));

        List<String> list = lines.stream()
                .map(w -> w.split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(String::toLowerCase, w -> 1, Integer::sum));

        wordCounter.forEach((key, value) -> System.out.println(key + ":" + convert(value)));
    }

    private static String convert(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
