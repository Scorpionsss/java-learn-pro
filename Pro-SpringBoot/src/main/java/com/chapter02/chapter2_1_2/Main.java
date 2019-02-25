package com.chapter02.chapter2_1_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println(demoSingletonService1.equals(demoSingletonService2));
        System.out.println(demoPrototypeService1.equals(demoPrototypeService2));

        context.close();
    }
}
