import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class P47 {

    public static void main(String[] args) throws ParseException {
        JSONParser parser = new JSONParser();
        Object parse = parser.parse(get("http://api.open-notify.org/astros.json", false));
        JSONObject o = (JSONObject) parse;
        JSONArray people = (JSONArray) o.get("people");

        List<String> names = new ArrayList<>();
        List<String> crafts = new ArrayList<>();

        int nameWidthSizes = Integer.MIN_VALUE;
        int craftWidthSizes = Integer.MIN_VALUE;
        for (Object value : people) {
            JSONObject person = (JSONObject) value;
            String name = (String) person.get("name");
            if (nameWidthSizes < name.length()) {
                nameWidthSizes = name.length();
            }
            names.add(name);
            String craft = (String) person.get("craft");
            if (craftWidthSizes < craft.length()) {
                craftWidthSizes = craft.length();
            }
            crafts.add(craft);
        }

        System.out.println("Name" + convert(nameWidthSizes - 4, ' ') + "|" + "Craft" + convert(craftWidthSizes - 5, ' '));
        System.out.println("----" + convert(nameWidthSizes - 4, '-') + "|" + "-----" + convert(craftWidthSizes - 5, '-'));
        for (int i = 0; i < names.size(); i++) {
            String n = names.get(i);
            int nSize = n.length();
            int i1 = nameWidthSizes - nSize;
            String convert = convert(i1, ' ');
            String c = crafts.get(i);
            int cSize = c.length();
            int i2 = craftWidthSizes - cSize;
            String convert1 = convert(i2, ' ');
            System.out.println(n + convert + "|" + c + convert1);
        }

    }
    private static String convert(int count, char a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(a);
        }
        return sb.toString();
    }

    public static String get(String strUrl, boolean head) {
        try {
            URL url = new URL(strUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            con.setRequestMethod("GET");
            con.setDoOutput(false);

            StringBuilder sb = new StringBuilder();
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                if (head){
                    sb.delete(0, sb.indexOf("\n"));
                    sb.delete(sb.length(), sb.indexOf("\n"));
                }
                br.close();
                return sb.toString();
            } else {
                System.out.println(con.getResponseMessage());
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return "";
    }
}
