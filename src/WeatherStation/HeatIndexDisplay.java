package WeatherStation;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private float heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Формула с потолка :
        heatIndex = (float) (16.92 * temperature * humidity);
        display();
    }
}
