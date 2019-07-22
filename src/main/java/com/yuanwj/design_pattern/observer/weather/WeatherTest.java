package com.yuanwj.design_pattern.observer.weather;

public class WeatherTest {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        WeatherObserver weatherObserver = new WeatherObserver(weatherSubject);
        HeatIndexObserver heatIndexObserver = new HeatIndexObserver(weatherSubject);
        weatherSubject.messurements(2.4f, 6.7f, 4f);

    }
}
