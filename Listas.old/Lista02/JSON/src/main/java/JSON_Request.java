import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JSON_Request {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://api.github.com/users/kyriosdata");

        try {
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("URL informada não existe");
                return;
            }


            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;

            while ((current = in.readLine()) != null) {
                urlString += current;
            }

            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map;
            map = mapper.readValue(urlString, new TypeReference<Map<String, String>>() {});
            Object a = new Object();
            String pureLink = map.put("avatar_url", a).toString();
            System.out.println(pureLink);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
