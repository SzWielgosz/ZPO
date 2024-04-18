package example;

public class CurrentConditionDisplay implements DisplayElement, Observer{
    private double temperature;
    private double humidity;
    private double pressure;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    @Override
    public void display() {
        System.out.println("Temperature: " + this.temperature);
    }
}