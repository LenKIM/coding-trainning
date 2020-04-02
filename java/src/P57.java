import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 트리비아 앱
 * 여러 개의 선택을 할 수 있는 트리비아 애플
 *
 */
public class P57 {

    static class Problem{
        String question;
        String answer;

        public Problem(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }
    }

    public static void main(String[] args) throws IOException {


        List<Problem> collect = Files.readAllLines(Paths.get("java/src/texture/trivia.txt")).stream()
                .map(w -> {
                    String[] split = w.split("/");
                    return new Problem(split[0], split[1]); })
                .collect(Collectors.toList());
        Collections.shuffle(collect);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("정답은 오직 O/X");
        for (Problem problem : collect) {
            String answer = Util.promptData(problem.question, sc);
            if (answer.equalsIgnoreCase(problem.answer)) {
                count = count + 1;
                System.out.println("정답!");
            } else {
                System.out.println("땡!");
                break;
            }
        }
        System.out.println("총 맞춘 횟수: " + count);
    }
}
