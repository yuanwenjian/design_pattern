package com.yuanwj.design_pattern.observer.weather;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
