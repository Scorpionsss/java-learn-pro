package com.chapter01.charpter1_3_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UserFonctionService userFonctionService = context.getBean(UserFonctionService.class);
        System.out.println(userFonctionService.sayHello("helloworld"));

        context.close();
    }
}
