import java.util.Scanner;

/**
 * 카르보넨 심박수
 * 루프를 사용할 때 카운터를 얼마나 많이 증가시키는지를 제어하는 것이 일반적이지만, 항상 1씩 증가시킬 필요는 없다.
 *
 * TargetHeartRate = (((200-age)-restingHR) X intensity) + restingHR
 *
 */
public class P31 {

    private static long prompt(String message, Scanner sc) {
        System.out.println(message);
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("try Again");
        }
        return sc.nextLong();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long restingHR = prompt("Resting Pulse: ", sc);
        long age = prompt("Age: ", sc);

        for (int intensity = 55; intensity <= 95; intensity++) {
            double v = intensity * 0.01;
            double v1 = (((220 - age) - restingHR) * v) + restingHR;
            System.out.println(intensity + "% " + Math.round(v1) + "bpm");
        }
    }
}
