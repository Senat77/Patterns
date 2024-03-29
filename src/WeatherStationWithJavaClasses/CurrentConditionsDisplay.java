package WeatherStationWithJavaClasses;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + " F degrees and " + humidity + " % humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            temperature = ((WeatherData) o).getTemperature();
            humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }
}
