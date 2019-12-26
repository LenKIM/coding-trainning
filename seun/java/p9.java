import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SangEun on 2019-12-19.
 */
public class p9 {
    private static final int PAINT_LITER_COVERAGE = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("What is the width of the room in meter? ");
        double width = ConvertUtil.parseStringToDouble(br.readLine());
        System.out.print("What is the height of the room in meter? ");
        double height = ConvertUtil.parseStringToDouble(br.readLine());

        double roomSize = width * height;
        int paint = (int) Math.ceil(roomSize / PAINT_LITER_COVERAGE);

        System.out.println("You will need to purchase " +  paint + " liters of paint to cover " + roomSize + " square meters.");
    }
}
