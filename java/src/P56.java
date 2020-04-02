import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

/**
 * Created by joenggyu0@gmail.com on 4/2/20
 * Github : http://github.com/lenkim
 */

public class P56 {

    public static class Item {
        String name;
        String SerialName;
        String value;

        public Item(String name, String serialName, String value) {
            this.name = name;
            SerialName = serialName;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("만약 입력을 중지하려면 end 를 입력해주세요.");

        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        while (true){
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("end")){
                break;
            }
            String name = Util.promptData("Name: ", sc);
            String serialName = Util.promptData("SerialNumber: ", sc);
            String value = Util.promptData("Value: ", sc);
            object.put("name", name);
            object.put("serialName", serialName);
            object.put("value", value);
            array.add(object);
        }

        System.out.println(array);
    }
}
