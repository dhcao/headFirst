package observerPattem.javaObserverPattern.observerMenu;

import observerPattem.javaObserverPattern.service.DisplayElement;
import observerPattem.javaObserverPattern.subjectMenu.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by KEY on 2018/3/5.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData sd = (WeatherData) o;
            this.temperature = sd.getTemperature();
            this.humidity = sd.getHumidity();
            display();
        }
    }
    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
    }


}
