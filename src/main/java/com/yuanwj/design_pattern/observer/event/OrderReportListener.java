package com.yuanwj.design_pattern.observer.event;

public class OrderReportListener implements EventListener {
    @Override
    public void listener(Event event) {
        if (event instanceof OrderEvent) {
            OrderEvent orderEvent = (OrderEvent) event;
            System.out.println("订单"+orderEvent.getOrderCode()+"已经发货,插入报表");
        }
    }
}
