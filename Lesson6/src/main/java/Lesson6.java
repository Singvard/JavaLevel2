import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class Lesson6 {

    public static void main(String[] args) {

        Gson g = new Gson();
        Forecast forecast = g.fromJson(Weather.getHTTP(),Forecast.class);

        for (int i = 0; i < 8; i++) {
            Date date = new Date((long) forecast.daily.get(i).dt * 1000);

            System.out.println("В городе Оренбург на дату " + date + " ожидается " + forecast.daily.get(i).weather.get(0).description +
                    ", температура " + Math.round(forecast.daily.get(i).temp.day));
        }
    }

    class Forecast {
        public double lat;
        public double lon;
        public String timezone;
        public int timezone_offset;
        public List<Days> daily;
    }
    class Days {
        public int dt;
        public int sunrise;
        public int sunset;
        public int moonrise;
        public int moonset;
        public double moon_phase;
        public Temp temp;
        public Feels feels_like;
        public int pressure;
        public int humidity;
        public double dew_point;
        public double wind_speed;
        public int wind_deg;
        public double wind_gust;
        public List<Wthr> weather;
        public int clouds;
        public double pop;
        public double rain;
        public double uvi;
    }
    class Temp {
        public double day;
        public double min;
        public double max;
        public double night;
        public double eve;
        public double morn;
    }
    class Feels {
        public double day;
        public double night;
        public double eve;
        public double morn;
    }
    class Wthr {
        public int id;
        public String common;
        public String description;
        public String icon;
    }
}
