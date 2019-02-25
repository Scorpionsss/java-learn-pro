package com.chapter01.charpter1_3_2;

//没有使用@Service声明bean
public class UserFonctionService {

    //没有使用@Autowired注入bean
    private FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
