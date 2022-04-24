import com.google.gson.Gson;

import java.util.List;

public class Lesson6 {

    public static void main(String[] args) {

        System.out.println(Weather.getHTTP());
        Gson g = new Gson();
        Forecast forecast = g.fromJson(Weather.getHTTP(),Forecast.class);

        System.out.println("\nПрогноз погоды в Оренбурге на ближайшие 5 дней:");
        System.out.println("Широта: " + forecast.lat);
        System.out.println("Долгота: " + forecast.lon);
        System.out.println("Часовой пояс: " + forecast.timezone + " (+" + forecast.timezone_offset / 3600 + " часов)\n");

        for (int i = 0; i < 6; i++) {
            java.util.Date date = new java.util.Date((long) forecast.daily.get(i).dt * 1000);
            System.out.println("Прогноз на дату: " + date);
            System.out.println("Ожидаемая погода: " + forecast.daily.get(i).weather.get(0).description);
            System.out.println("Температура ночью: +" + Math.round(forecast.daily.get(i).temp.night) +
                    " (по ощущениям +" + Math.round(forecast.daily.get(i).feels_like.night) + ")");
            System.out.println("Температура днём: +" + Math.round(forecast.daily.get(i).temp.day) +
                    " (по ощущениям +" + Math.round(forecast.daily.get(i).feels_like.day) + ")");
            System.out.println("Скорость ветра: " + Math.round(forecast.daily.get(i).wind_speed) + " м/сек");
            System.out.println("Влажность воздуха: " + forecast.daily.get(i).humidity + "%");
            System.out.println();
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
