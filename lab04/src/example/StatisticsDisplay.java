package example;

public class StatisticsDisplay implements DisplayElement, Observer{

    private double temperature;
    private double humidity;
    private double pressure;

    private Subject weatherData;

    @Override
    public void display() {

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {

    }
}
