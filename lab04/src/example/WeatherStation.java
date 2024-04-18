package example;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(13., 46., 1001.);
        weatherData.setMeasurements(16., 26., 986.);
        weatherData.setMeasurements(23., 58., 1016.);

        weatherData.removeObserver(ccd);
        weatherData.setMeasurements(99., 99., 9999.);
    }
}
