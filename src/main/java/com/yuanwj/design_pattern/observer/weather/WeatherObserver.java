package com.yuanwj.design_pattern.observer.weather;

/**
 * 观察者
 */
public class WeatherObserver implements Observer,DisplayElement {

    private WeatherSubject weatherSubject;

    public WeatherObserver(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度："+weatherSubject.getTemperature()+
                "湿度："+weatherSubject.getHumidity()+"气压："+weatherSubject.getPressure());
    }

    @Override
    public void update() {
        display();
    }
}
