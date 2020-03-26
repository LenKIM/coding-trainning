import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Scanner;

public class P48 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String city = Util.promptData("Where are you?", sc);
        String s = P47.get("http://openweathermap.org/data/2.5/weather?q=" + city + "&appid=b6907d289e10d714a6e88b30761fae22",false);
        JSONParser parser = new JSONParser();
        Object parse = parser.parse(s);
        JSONObject o = (JSONObject) parse;
        JSONObject main = (JSONObject) o.get("main");
        Double temp = (Double) main.get("temp");
        System.out.println(city + " weather: ");
        System.out.println(temp + " degrees Fahrenheit");
        //예제는 London,uk
    }

}
