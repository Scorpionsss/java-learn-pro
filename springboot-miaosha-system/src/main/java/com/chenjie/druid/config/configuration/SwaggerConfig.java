package com.chenjie.druid.config.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName SwaggerConfig
 * @Description 访问接口平台的地址http://localhost:9680/supplychainfinance-audit/swagger-ui.html
 * @author zhigang.zhou
 * @Date 2018年11月27日 下午1:16:35
 * @version 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        ParameterBuilder ticketPar1 = new ParameterBuilder();
        ticketPar1.name("userToken").description("用户认证凭证")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false)
                .defaultValue("finance-61945865-27e5-4fa7-a24b-3d4e8e2dc96b")
                .build();
        List<Parameter> pars = new ArrayList<Parameter>();
        pars.add(ticketPar1.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chenjie.druid.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("chenjie-springboot-restful api")
                .description("springboot-druid api接口文档")
                //服务条款网址
                .termsOfServiceUrl("http://localhost/")
                .version("1.0.0")
                .contact(new Contact("chenjie", "", "chenjie_alan@163.com"))
                .build();
    }
}