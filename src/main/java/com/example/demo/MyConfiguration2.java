package com.example.demo;

import com.example.demo.pojo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author gugu
 * @Classname MyConfiguration2
 * @Description TODO
 * @Date 2022/9/4 15:43
 */
@Lazy
@Configuration
@ComponentScan(basePackages = "com.example.demo.pojo")
public class MyConfiguration2 {
    @Bean
    public MyBean myBean(){
        System.out.println("myBean Initialized");
        return new MyBean();
    }

    @Bean
    public MyBean IfLazyInit(){
        System.out.println("initialized");
        return new MyBean();
    }
}
