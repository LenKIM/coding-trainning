import java.util.Random;
import java.util.Scanner;

/**
 * Magic 8 Ball
 * 무작위로 질문 받아 아래 대답하기.
 * "Yes, No, Maybe, "Ask again later"
 *
 */
public class P33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] messages = {"Yes", "No", "Maybe", "Ask again later"};
        Util.promptData("What is your Question? ", sc);
        Random rm = new Random();
        int i = rm.nextInt(4);
        System.out.println(messages[i]);
    }
}
