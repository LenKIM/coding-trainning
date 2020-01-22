import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by SangEun on 2020-01-22.
 *
 * 두 개의 문자열을 비교하여 서로가 애너그램인지를 검사하는 프로그램을 작성하라.
 * 프로그램은 두 개의 문자열을 입력 받은 후 출력 예와 같이 출력해야 한다.
 *
 * 제약 조건
 * 1. isAnagram 이라는 함수를 사용하여 프로그램을 작성할 것.
 *    isAnagram 함수는 두 개의 문자열을 인수로 받은 다음 true 또는 false 를 반환한다.
 *    이 함수를 main 프로그램에서 호출하도록 할 것
 * 2. 두 단어의 길이가 같은지 확일할 것
 *
 */
public class p24 {
    private static String firstAnswer;
    private static String secondAnswer;

    public static void main(String[] args) throws IOException {
        boolean result = isAnagram();

        if(result) {
            System.out.println("\"" + firstAnswer + "\" and \" " + secondAnswer + "\" are anagrams.");
        } else {
            System.out.println("\"" + firstAnswer + "\" and \" " + secondAnswer + "\" are not anagrams.");
        }
    }

    private static boolean isAnagram() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        firstAnswer = br.readLine();
        System.out.print("Enter the second string: ");
        secondAnswer = br.readLine();

        char[] firstArray = firstAnswer.toCharArray();
        char[] secondArray = secondAnswer.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return isEqualsStrArray(firstArray, secondArray) && isSameLengthStr();
    }

    private static boolean isEqualsStrArray(char[] firstArray, char[] secondArray) {
        return Arrays.toString(firstArray).equalsIgnoreCase(Arrays.toString(secondArray));
    }

    private static boolean isSameLengthStr() {
        return firstAnswer.length() == secondAnswer.length();
    }

}
