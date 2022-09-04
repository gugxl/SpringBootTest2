package com.example.demo;

import com.example.demo.pojo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gugu
 * @Classname MyConfiguration
 * @Description TODO
 * @Date 2022/9/4 15:25
 */
@Configuration
public class MyConfiguration {
    @Bean
    public MyBean myBean(){
        System.out.println("myBean Initialized");
        return new MyBean();
    }
}
