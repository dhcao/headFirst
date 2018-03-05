package observerPattem.myObserverPattern.subjectMenu;

import observerPattem.myObserverPattern.observerMenu.Observer;

import java.util.ArrayList;

/**
 * Created by KEY on 2018/3/5.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当观测站更新观测值时，通知观测者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 获取观测值
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    //其它方法
}
