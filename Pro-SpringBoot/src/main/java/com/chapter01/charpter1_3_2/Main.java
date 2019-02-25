package com.chapter01.charpter1_3_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UserFonctionService userFonctionService = context.getBean(UserFonctionService.class);

        System.out.println(userFonctionService.sayHello("Java Config"));

        context.close();
    }
}
