package com.chapter02.chapter2_5_2;
/**
 * 自定义事件
 */

import org.springframework.context.ApplicationEvent;

public class DempEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;

    public DempEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
