import java.util.Objects;
import java.util.Scanner;

/**
 * Blood Alcohol Content, BAC 계산하기
 * BAC = ( A x 5.14/W x r) - 0.15 X H
 * A - 총 알코올 소비량
 * W - 몸무게(파운드 단위)
 * r - 성별에 따른 알코홀 흡수비 계수 0.73/0.6
 * H - 술을 마신후 경과 시간
 */
public class P17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = promptGetData("총 알코올 소비량은(ml)? ", sc);
        A = mlToOzConverter(A);

        double W = promptGetData("몸무게(우리나라 무게 단위 Kg) ", sc);
        W = kgToFoundConverter(W);

        double r = promptGetGender("남/녀(m/f) 한 글자만 입력", sc);
        double H = promptGetData("술을 마신 후 경과 시간", sc);

        double result = calculateBAC(A, W, r, H);
        System.out.println("Your BAC is " + result);
        System.out.println(result > 0.08 ? "It is not legal for you to drive" : "Pass");
    }

    private static double mlToOzConverter(double a) {
        return a * 0.033814;
    }

    private static double kgToFoundConverter(double w) {
        double v = w * 2.204622621849;
        return Math.round(v * 100) / 100;
    }

    private static double calculateBAC(double a, double w, double r, double h) {
        return (a * (5.14 / w) * r) - (0.015 * h);
    }


    private static double promptGetGender(String s, Scanner sc) {
        System.out.println(s);
        while (!sc.hasNext("[m|f]")) {
            sc.next();
            System.out.println("정확한 성별을 입력");
        }
        String a = sc.next();
        return Objects.equals(a, "m") ? 0.73 : 0.6;
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
