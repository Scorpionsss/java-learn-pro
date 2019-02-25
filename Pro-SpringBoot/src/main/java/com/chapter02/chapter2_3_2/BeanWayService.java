package com.chapter02.chapter2_3_2;

public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanwayService");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
