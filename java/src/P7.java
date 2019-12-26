import java.util.Scanner;

/**
 * 글로벌 환경에서 일을 하다 보면 국제표준 단위와 피트/야드 단위로 정보를 나타내야 할 일이 생길 것이다.
 * 물론 어느 시점에 도량형을 변환해야 가장 정확한 값을 구할 수 있는지도 알아야 할 것이다.
 * 방의 면적을 계산하는 프로그램을 작성하라.
 * 방의 길이와 폭을 피트 단위로 입력 받은 다음 제곱피트와 제곱미터로 면적을 나타내보자.
 */
public class P7 {

    public static void main(String[] args) {

        final long unit = (long) 10.763910416667;
        //convert unit ->

        System.out.println("What is the length of the room in feet?");

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long roomLength = sc.nextLong();

        System.out.println("What is the width of the room in feet?");
        while (!sc.hasNextLong()) {
            sc.next();
            System.out.println("Confirm your input");
        }
        long width = sc.nextLong();

        System.out.println("You entered dimensions of " + roomLength + " feet by " + width + "feet");
        long result = Math.multiplyExact(roomLength, width);
        System.out.println("The area is " + result + " square feet");
        long multiplyExact = Math.multiplyExact(result, unit);
        System.out.println(multiplyExact + " square meters");
    }
}
