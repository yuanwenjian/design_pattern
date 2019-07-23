package com.yuanwj.design_pattern.observer.event;

public class OrderListener implements EventListener {
    @Override
    public void listener(Event event) {
        if (event instanceof OrderEvent) {
            OrderEvent orderEvent = (OrderEvent) event;
            System.out.println("订单编码" + orderEvent.getOrderCode() + "已发货,插入绩效表中");
        }
    }
}
