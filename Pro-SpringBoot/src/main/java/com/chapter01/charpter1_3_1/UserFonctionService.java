package com.chapter01.charpter1_3_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFonctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
