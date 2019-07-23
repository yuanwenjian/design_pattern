package com.yuanwj.design_pattern.observer.event;

import java.util.ArrayList;
import java.util.List;

public class OrderEventSource implements EventSource{

    private List<EventListener> listeners;

    public void addListener(EventListener eventListener) {
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.add(eventListener);
    }

    @Override
    public void onEvent(Event event) {
        listeners.forEach(listeners->listeners.listener(event));
    }
}
