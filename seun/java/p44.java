import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class p44 {
    /**
     * Created by SangEun on 2020-03-06.
     * 제품 이름을 입력 받아 제품 이름에 해당하는 현재 가격과 수량을 조호하는 프로그램을 작성하라
     * 제품 데이터는 데이터 파일에 JSON 형태로 저장된다.
     * 제품을 찾을 경우에는 제품 이름, 가격, 수량을 출력하고,
     * 제품을 찾지 못한 경우에는 제품이 없다는 문구를 출력해보자.
     * <p>
     * 제약 조건
     * 1. JSON 파서를 이용하여 파일의 내용을 가져오도록 구현할 것
     * 2. 검색된 내용이 없을 때는 다시 입력을 받도록 구현할 것
     */
    public static void main(String[] args) throws IOException {
        File resourceFile = new File("res/Products");
        BufferedReader fbr = new BufferedReader(new FileReader(resourceFile));
        BufferedReader ibr = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();

        String line;
        while ((line = fbr.readLine()) != null) {
            s.append(line);
        }

        try {
            String txt = s.toString();
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(txt);
            JSONArray productsArray = (JSONArray) jsonObj.get("products");


            boolean flag = true;
            int index = 0;
            while (flag) {
                System.out.print("What is the product name? ");
                String name = ibr.readLine();

                for (int i = 0; i < productsArray.size(); i++) {
                    JSONObject obj = (JSONObject) productsArray.get(i);
                    if(obj.get("name").equals(name)) {
                        flag = false;
                        index = i;
                    }
                }
                if(flag) {
                    System.out.println("Sorry that product was not found in our inventory.");
                }
            }

            JSONObject obj = (JSONObject) productsArray.get(index);
            System.out.println("Name: " + obj.get("name"));
            System.out.println("Price: $" + obj.get("price"));
            System.out.println("Quantity on hand: " + obj.get("quantity"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
