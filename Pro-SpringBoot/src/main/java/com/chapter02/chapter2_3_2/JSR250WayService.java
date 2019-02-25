package com.chapter02.chapter2_3_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-jsr250wayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
