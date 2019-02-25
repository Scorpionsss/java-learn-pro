package com.chapter02.chapter2_5_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布器
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DempEvent(this,msg));
    }
}
