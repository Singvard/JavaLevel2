import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class Weather {
    public static String getHTTP(){
        String url = "https://api.openweathermap.org/data/2.5/onecall?lat=51.7727&lon=55.0988&exclude=current,minutely,hourly,alerts&appid=384a97ada5a4568e913820b7d802ca91&units=metric&lang=ru";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        try {
            CloseableHttpResponse resp = client.execute(get);
            HttpEntity entity = resp.getEntity();
            return EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error!";
        }
    }
}
