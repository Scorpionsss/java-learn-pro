package com.chapter01.charpter1_3_1;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello" + word + "!";
    }
}
