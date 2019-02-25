package com.chapter01.charpter1_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UserFonctionService userFonctionService(FunctionService functionService){
        UserFonctionService userFonctionService = new UserFonctionService();
        userFonctionService.setFunctionService(functionService);
        return userFonctionService;
    }


}
