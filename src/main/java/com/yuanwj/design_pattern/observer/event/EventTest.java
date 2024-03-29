package com.yuanwj.design_pattern.observer.event;

public class EventTest {
    public static void main(String[] args) {
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setOrderCode("yuanwj");

        OrderEventSource orderEventSource = new OrderEventSource();
        OrderListener orderListener = new OrderListener();
        OrderReportListener orderReportListener = new OrderReportListener();
        orderEventSource.addListener(orderListener);
        orderEventSource.addListener(orderReportListener);


        orderEventSource.onEvent(orderEvent);
    }
}
