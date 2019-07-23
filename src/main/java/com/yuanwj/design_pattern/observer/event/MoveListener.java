package com.yuanwj.design_pattern.observer.event;

public class MoveListener implements EventListener {
    @Override
    public void listener(Event event) {
        if (event instanceof MoveEvent) {
            MoveEvent moveEvent = (MoveEvent) event;
            System.out.println("移动单" + moveEvent.getMoveCode() + "完成，添加到绩效");

        }
    }
}
