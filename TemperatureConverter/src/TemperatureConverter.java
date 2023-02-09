public class TemperatureConverter {
    public double toCelsius( double temperature){
     double celsius= 5* (temperature - 32) / 9;
     return celsius;
    }
    public double toFahrenheit(double temperature){
        double fahrenheit= ((temperature*9)/5)+32;
        return fahrenheit;

    }



}



