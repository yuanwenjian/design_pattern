package com.yuanwj.design_pattern.observer.event;

public class OrderEvent implements Event {

    private String orderCode;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
