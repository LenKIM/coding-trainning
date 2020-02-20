import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by SangEun on 2020-02-14.
 *
 * 숫자 맞추기 게임
 * 난이도를 입력 받은 후 게임을 시작한다.
 * 컴퓨터는 범위 내에서 무작위로 숫자를 하나 선택한 후 숫자를 맞추라고 표시한다.
 * 플레이어가 숫자를 입력할 때마다 컴퓨터는 맞추어야 하는 숫자와 비교하여 입력한 숫자가 더 큰지 작은지를 알려준다.
 * 또한, 컴퓨터는 맞추는 횟수를 기록하여 맞추었을 때 그동안 추리한 횟수를 알려준다.
 * 그리고 게임을 다시 할 것인지를 묻는다.
 *
 * 제약 조건
 * 1. 숫자가 아닌 값을 입력하지 않도록 구현할 것
 * 2. 게임이 진행되는 동안 숫자가 아닌 값을 입력할 때마다 잘못된 입력으로 카운트할 것.
 */
public class p32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean flag = true;
        int guess;

        System.out.println("Let's play Guess the Number: ");
        System.out.print("Pick a difficulty level (1, 2, or 3): ");
        int difficulty = ConvertUtil.parseStringToInt(br.readLine());
        int randomNum = getRandomNumber(difficulty);

        System.out.print("I have my number. What's your guess? ");

        while (flag) {
            String res = br.readLine();
            if (ConvertUtil.isValidStringToInt(res)) {
                guess = ConvertUtil.parseStringToInt(res);
                if (guess == randomNum) {
                    System.out.println("You got it in " + count + " guesses!");
                } else if (guess > randomNum) {
                    System.out.print("Too high. Guess again: ");
                } else {
                    System.out.print("Too low. Guess again: ");
                }
            } else {
                count++;
                System.out.print("Invalid input. Guess again: ");
            }

            System.out.print("Play again?(y/n) ");
            String response = br.readLine();

            if (!response.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                flag = false;
            }
        }
    }

    private static int getRandomNumber(int difficulty) {
        Random r = new Random();
        return r.nextInt();
    }
}
