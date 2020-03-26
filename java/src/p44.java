import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * 제품 이름을 입력 받아 제품 이름에 해당하는 현재 가격과 수량을 조호하는 프로그램을 작성하라
 * 제품 데이터는 데이터 파일에 JSON 형태로 저장된다.
 * 제품을 찾을 경우에는 제품 이름, 가격, 수량을 출력하고,
 * 제품을 찾지 못한 경우에는 제품이 없다는 문구를 출력해보자.
 * <p>
 * 제약 조건
 * 1. JSON 파서를 이용하여 파일의 내용을 가져오도록 구현할 것
 * 2. 검색된 내용이 없을 때는 다시 입력을 받도록 구현할 것
 * */
public class p44 {

    public static void main(String[] args) throws IOException, ParseException {

        Scanner sc = new Scanner(System.in);
        String s = "What is the product name? ";
        String x = "Sorry that product was not found in our inventory.";

        Path path = Paths.get("java/src/texture/p44.txt");
        List<String> strings = Files.readAllLines(path);

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(String.join("", strings));
        JSONObject a = (JSONObject) obj;
        JSONArray productsArray = (JSONArray) a.get("products");

        boolean isEnd = true;
        int index = 0;
        while (isEnd) {
            String name = Util.promptData(s, sc);
            for (int i = 0; i < productsArray.size(); i++) {
                JSONObject o = (JSONObject) productsArray.get(i);
                if(o.get("name").equals(name)) {
                    isEnd = false;
                    index = i;
                }
            }

            if(isEnd) {
                System.out.println(x);
            }
        }

        JSONObject o = (JSONObject) productsArray.get(index);
        System.out.println("Name: " + o.get("name"));
        System.out.println("Price: $" + o.get("price"));
        System.out.println("Quantity on hand: " + o.get("quantity"));
    }
}
