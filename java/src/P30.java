/**
 * 0부터 12까지의 곱셈표
 */
public class P30 {

    public static void main(String[] args) {

        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}
