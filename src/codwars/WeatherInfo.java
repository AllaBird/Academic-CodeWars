package codwars;

public class WeatherInfo {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature * 1.0 - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        System.out.println(weatherInfo(50));
        System.out.println(weatherInfo(23));
        System.out.println(weatherInfo(68));
        System.out.println(weatherInfo(54));
    }
}
