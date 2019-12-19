import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-19.
 */
public class p7 {
    private static final double CONVERT_SQUARED_METERS = 10.76391;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the width of the room in feet? ");
        int width = ConvertUtil.parseStringToInt(br.readLine());
        System.out.print("What is the height of the room in feet? ");
        int height = ConvertUtil.parseStringToInt(br.readLine());
        System.out.println("You entered dimensions of " + width + " feet by " + height + " feet");

        double roomSizeFeet = width * height;
        double roomSizeMeters = roomSizeFeet / CONVERT_SQUARED_METERS;

        System.out.println("The area is");
        System.out.println(roomSizeFeet + " square feet");
        System.out.println(roomSizeMeters + " square meters");
    }
}
