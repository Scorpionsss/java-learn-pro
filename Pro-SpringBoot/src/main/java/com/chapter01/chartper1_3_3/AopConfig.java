package com.chapter01.chartper1_3_3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.chapter01.chartper1_3_3")
@EnableAspectJAutoProxy//开启Spring对Aspect的支持
public class AopConfig {
}
