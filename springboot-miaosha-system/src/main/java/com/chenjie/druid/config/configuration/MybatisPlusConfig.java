package com.chenjie.druid.config.configuration;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisPlusConfig {
    /**
     * @Description : mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * @Description : druid注入
     */
    /*@Bean
    @ConfigurationProperties(prefix="spring.datasource" )
    public DataSource dataSource() {
        return DruidDataSourceBuilder
                .create()
                .build();
    }*/
}
