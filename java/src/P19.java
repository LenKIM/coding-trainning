import java.util.Scanner;

/**
 * BMI 계산기
 * bmi = (weight/(height x height)) * 703
 * 인치 / 파운드
 * 키 / 몸무게
 * 18.5 - 25 : 정상
 * 18.5 아래 : 저체중
 * 25 위 : 과체중
 */
public class P19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = promptGetData("weight: ", sc);
        double height = promptGetData("height: ", sc);

        double v = (weight / (height * height)) * 703;
        long l = Math.round(v * 10) / 10; // 한자리 수 반올림
        System.out.println("Your BMI is " + l);
        printBMI(l);
    }

    private static void printBMI(long l) {
        if (l < 18.5) {
            System.out.println("저체중");
        } else if (18.5 <= l && l <= 25) {
            System.out.println("정상");
        } else if (l < 25) {
            System.out.println("고체중");
        }
    }

    private static double promptGetData(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        return sc.nextDouble();
    }
}
