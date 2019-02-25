package com.chapter01.chartper1_3_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        //demoAnnotationService.delete();

        demoMethodService.add();

        demoMethodService.delete();

        context.close();
    }
}
