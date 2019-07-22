package com.yuanwj.design_pattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public class WeatherSubject implements Subject {

    private List<Observer> observers ;

    private float temperature;//温度

    private float humidity;//湿度

    private float pressure;//气压

    public WeatherSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (this.observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        this.observers.forEach(observer -> observer.update());
    }

    public void messurementsChange() {
        notifyObserver();
    }


    public void messurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementsChange();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
