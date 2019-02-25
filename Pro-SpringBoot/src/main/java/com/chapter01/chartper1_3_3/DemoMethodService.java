package com.chapter01.chartper1_3_3;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("DemoMethodService add方法内操作...");
    }

    public void delete(){
        System.out.println("DemoMethodService delete方法内操作...");
    }
}
