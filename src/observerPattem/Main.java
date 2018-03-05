package observerPattem;

import observerPattem.myObserverPattern.observerMenu.CurrentConditionsDisplay;
import observerPattem.myObserverPattern.subjectMenu.WeatherData;

/**
 * Created by KEY on 2018/3/5.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        wd.setMeasurements(80,64,30.4f);
        wd.setMeasurements(70,64,30.4f);
        wd.setMeasurements(75,64,30.4f);
    }
}
