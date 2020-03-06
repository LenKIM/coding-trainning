import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by SangEun on 2020-02-21.
 * 안전한 암호를 생성하는 프로그램을 작성하라.
 * 암호의 최소 길이, 특수문자 개수, 숫자 개수를 입력 받으면 이에 해당하는 암호를 생성한다.
 *
 * 제약 조건
 * 1. 리스트를 이용하여 글자를 저장한 다음 암호를 만드는 데 사용할 것
 * 2. 암호 생성을 위해 일부 무작위 요소를 추가할 것
 */
public class p37 {
    private static List<String> specialCharArray = Arrays.asList("~","!","@", "#", "$", "%", "^", "&", "*", "?");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What's the minimum length? ");
        int minLength = ConvertUtil.parseStringToInt(br.readLine());
        if(minLength <= 0) {
            System.out.println("Invalid length. exit.");
            System.exit(0);
        }
        System.out.print("How many special characters? ");
        int specialChar = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("How many numbers? ");
        int number = ConvertUtil.parseStringToInt(br.readLine());

        String res = getRandomPwd(minLength, specialChar, number);

        List<String> splitRes = Arrays.asList(res.split(""));
        Collections.shuffle(splitRes);

        res = splitRes.stream().collect(Collectors.joining());

        System.out.println("Your password is " + res);
    }

    private static String getRandomPwd(int minLength, int specialChar, int number) {
        StringBuilder res = new StringBuilder();
        if(specialChar > 0) {
            for(int i = 0; i < specialChar; i++) {
                res.append(specialCharArray.get(getRandomNumber()));
            }
        }
        if(number > 0) {
            for(int i = 0; i < number; i++) {
                res.append(getRandomNumber());
            }
        }

        if(res.length() < minLength) {
            for(int i = 0; i < minLength - res.length(); i++) {
                res.append(specialCharArray.get(getRandomNumber()));
            }
        }
        return res.toString();
    }

    private static int getRandomNumber() {
        Random r = new Random();
        return r.nextInt(10);
    }

}
