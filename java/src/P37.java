import java.util.*;

/**
 * 암호 생성기
 * 컴퓨터르 이용해서 특정 요구사항을 만족시키는 암호를 만들 수 있는데,
 * 이를 통해 무작위 숫자 생성기를 이용해 기존 리스트와 연결시키는 것을 연습.
 */
public class P37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long length = Util.promptLongData("What's the minimum length?", scanner);
        long specialCharactersLength = Util.promptLongData("How many special characters?", scanner);
        long numberLength = Util.promptLongData("How many numbers", scanner);

        long l = specialCharactersLength + numberLength;
        long normalCharactersLength = length - l;

        Random random = new Random();
        List<String> values = new ArrayList<>();
        for (int i = 0; i < numberLength; i++) {
            String randomStr = String.valueOf(random.nextInt(10));
            values.add(randomStr);
        }

        for (int i = 0; i < normalCharactersLength; i++) {
            String randomStr = String.valueOf((char) (random.nextInt(26) + 97));
            values.add(randomStr);
        }
        final String specialChars = "!@#$%^&*";
        for (int i = 0; i < specialCharactersLength; i++) {
            int index = random.nextInt(specialChars.length() - 1);
            char c = specialChars.charAt(index);
            values.add(String.valueOf(c));
        }
        Collections.shuffle(values);

        System.out.println(String.join("", values));


    }
}
