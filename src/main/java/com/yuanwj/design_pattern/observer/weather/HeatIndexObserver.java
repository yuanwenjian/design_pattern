package com.yuanwj.design_pattern.observer.weather;

public class HeatIndexObserver implements Observer, DisplayElement {

    private float heatIndex;

    private WeatherSubject weatherSubject;

    public HeatIndexObserver(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("酷热指数为："+heatIndex);
    }

    @Override
    public void update() {
        heatIndex = this.weatherSubject.getHumidity()
                * this.weatherSubject.getHumidity()
                / this.weatherSubject.getTemperature()
                / this.weatherSubject.getTemperature()
                + this.weatherSubject.getPressure();
        display();
    }
}
