import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 여러 주를 지원하는 세금 계산
 */
public class P20 {

    public static void main(String[] args) {

        final String Wisconsin;
        final String Illinois;

        Map<String, Float> stateMap = new HashMap<>();
        stateMap.put("Wisconsin", 0.05f);
        stateMap.put("Seoul", 0.10f);

        Map<String, Map<String, Float>> counties = new HashMap<>();
        Map<String, Float> wisconsinCounty = new HashMap<>();
        Map<String, Float> seoulCounty = new HashMap<>();
        counties.put("Wisconsin", wisconsinCounty);
        counties.put("Seoul", seoulCounty);

        seoulCounty.put("mapu-gu", 0.003F);
        seoulCounty.put("hongda", 0.010F);

        wisconsinCounty.put("Eau Claire", 0.005F);
        wisconsinCounty.put("Dunn", 0.004F);

        Scanner sc = new Scanner(System.in);
        double amount = Util.promptDoubleData("What is the order amount? ", sc);
        sc.nextLine();
        String states = Util.promptData("What state do you live in? ", sc);
        String county = Util.promptData("What county do you live in? ", sc);

        StringBuilder sb = new StringBuilder();
        if (stateMap.containsKey(states)) {
            float stateTax = stateMap.get(states);
            float countyTax = counties.get(states).get(county);
            float totalTax = stateTax + countyTax;
            float totalAmount = (float) (amount + totalTax);
            sb.append("The state tax is $").append(stateTax)
                    .append(System.getProperty("line.separator")).append("The county tax is $").append(countyTax)
                    .append(System.getProperty("line.separator")).append("The total tax is $").append(totalTax)
                    .append(System.getProperty("line.separator")).append("The total is $").append(totalAmount);

            System.out.println(sb.toString());
        } else {
            System.out.println("데이터 없는 state 입니다." );
        }
    }
}
