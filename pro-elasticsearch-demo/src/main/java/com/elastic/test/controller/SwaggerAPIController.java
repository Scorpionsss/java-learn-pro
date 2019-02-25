package com.elastic.test.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="/SwaggerController",tags={"Swagger测试接口"})
public class SwaggerAPIController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts(@RequestParam String pruductId) {
        List<String> productsList = new ArrayList<>();
        productsList.add(pruductId);
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProduct(@RequestParam String pruductId) {
        return pruductId + "Product is saved successfully";
    }
}
