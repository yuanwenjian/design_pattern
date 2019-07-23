package com.yuanwj.design_pattern.observer.event;

public class MoveEvent implements Event {

    private String moveCode;

    public String getMoveCode() {
        return moveCode;
    }

    public void setMoveCode(String moveCode) {
        this.moveCode = moveCode;
    }
}
