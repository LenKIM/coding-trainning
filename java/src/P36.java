import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

/**
 * 통계 계산
 */
public class P36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isEnd = true;
        int count = 0;
        List<Integer> numbers = new ArrayList<>();
        while (isEnd) {
            count = count + 1;
            String s = sc.nextLine();
            if ("done".equals(s)) {
                isEnd = false;
            }
            int i = Integer.parseInt(s);
            numbers.add(i);
        }
        double v = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN);
        System.out.println("Numbers" + numbers.stream().map(Object::toString).collect(joining(", ")));
        System.out.println("The average is " + v);
        System.out.println("The minimum is " + numbers.stream().mapToDouble(Integer::doubleValue).max().orElse(Double.NaN));
        System.out.println("The maximum is " + numbers.stream().mapToDouble(Integer::doubleValue).min().orElse(Double.NaN));

        // Variance
        double variance = numbers.stream()
                .map(i -> i - v)
                .map(i -> i*i)
                .mapToDouble(i -> i).average().orElse(Double.NaN);

        System.out.println("The standard deviation is " + Math.sqrt(variance));


    }


}
