/**
 * Created by SangEun on 2019-12-19.
 */
public class ConvertUtil {
    public static int parseStringToInt(String number) {
        int result = 0;

        try {
            result = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Format error. Please retry.");
            System.exit(0);
        } catch (NullPointerException e) {
            System.out.println("You have to write answer. Please retry.");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
            System.exit(0);
        }

        return result;
    }

    public static double parseStringToDouble(String number) {
        double result = 0;

        try {
            result = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            System.out.println("Format error. Please retry.");
            System.exit(0);
        } catch (NullPointerException e) {
            System.out.println("You have to write answer. Please retry.");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
            System.exit(0);
        }

        return result;
    }
}
