package com.chapter01.chartper1_3_3;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截器的add操作"/*,gender = "saaaaaaaa"*/)
    public void add(){
        System.out.println("DemoAnnotationService方法内操作...");
    }
}
