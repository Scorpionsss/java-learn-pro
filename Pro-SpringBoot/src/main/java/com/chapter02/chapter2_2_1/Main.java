package com.chapter02.chapter2_2_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.event.AncestorEvent;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig elConfig = context.getBean(ElConfig.class);

        elConfig.outputResource();

        context.close();
    }
}
