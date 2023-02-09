public class Main {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter= new TemperatureConverter();
        System.out.println(temperatureConverter.toCelsius(96));
        System.out.println(temperatureConverter.toFahrenheit(34.5));
    }
}