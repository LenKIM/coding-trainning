import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class P49 {

    public static void main(String[] args) throws ParseException, IOException {
        JSONParser parser = new JSONParser();
        String s = P47.get("https://www.flickr.com/services/feeds/photos_public.gne?format=json", false);
        String replace = s.replace("jsonFlickrFeed(", "").replace(")", "");
        JSONObject parse = (JSONObject) parser.parse(replace);
        JSONArray items = (JSONArray) parse.get("items");


        Image image = null;
        for (Object item : items) {
            JSONObject object = (JSONObject) item;
            String title = (String) object.get("title");
            System.out.println(title);
            JSONObject media = (JSONObject) object.get("media");
            String m = (String) media.get("m");
            URL url = new URL(m);
            image = ImageIO.read(url);

            JFrame frame = new JFrame();
            frame.setSize(300, 300);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
            frame.setVisible(true);

        }
    }
}
