import java.util.Random;
import java.util.Scanner;

/**
 * 숫자 맞추기 게임
 * 난이도 입력받은 후 게임 시작. 컴퓨터는 범위 내에서 무작위로 숫자를 하나 선택한 후 숫자를 맞추라고 표시.
 * 플레이어가 숫자를 입력할 때마다 컴퓨터는 맞추어야 하는 숫자와 비교하여 입력한 숫자가 더 큰지 작은지를 알려준다.
 * 또한 컴퓨터는 맞추는 횟수를 기록하여 플레이어가 숫자를 맞추었을 때 그동안 추리한 횟수를 알려준다. 그리고는 게임을 다시 할 것인지를 묻는다.
 */
public class P32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isEnd = true;

        while (isEnd) {
            final String intro = "Let's play Guess the Number.";
            System.out.println(intro);
            long randomValue = promptGameLevel(sc);
            long input = Util.promptLongData("I have my number. What's your guess? ", sc);
            int count = 1;
            while (input != randomValue) {
                count = count + 1;
                if (randomValue > input) {
                    input = Util.promptLongData("Too low, Guess again", sc);
                } else {
                    input = Util.promptLongData("Too high, Guess again", sc);
                }
            }
            System.out.println("You got it in " + count + " guesses!");
            String yn = Util.promptDataWithPattern("Play again? [yes/no]", sc, "[y|n]");

            if (yn.equals("n")) {
                isEnd = false;
            }
        }
    }

    private static long promptGameLevel(Scanner sc) {
        Random rd = new Random();
        System.out.println("Pick a difficulty level (1, 2, or 3): ");
        while (!sc.hasNext("[1-3]")) {
            sc.next();
            System.out.println("try to input valid level");
        }
        long level = Long.parseLong(sc.next());
        long randomValue = 0;
        if (level == 1) {
            randomValue = rd.nextInt(11);
        } else if (level == 2) {
            randomValue = rd.nextInt(101);
        } else if (level == 3) {
            randomValue = rd.nextInt(1001);
        }
        return randomValue;
    }
}
