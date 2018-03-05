package observerPattem.javaObserverPattern.subjectMenu;



import java.util.Observable;

/**
 * Created by KEY on 2018/3/5.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 当观测站更新观测值时，通知观测者
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 获取观测值
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    //其它方法
}
