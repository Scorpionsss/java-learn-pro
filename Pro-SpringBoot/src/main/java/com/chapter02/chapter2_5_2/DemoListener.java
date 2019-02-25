package com.chapter02.chapter2_5_2;
/**
 *  事件监听器
 */

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DempEvent> {
    @Override
    public void onApplicationEvent(DempEvent dempEvent) {
        String msg = dempEvent.getMsg();

        System.out.println("接收到了发布的消息：" + msg);
    }
}
