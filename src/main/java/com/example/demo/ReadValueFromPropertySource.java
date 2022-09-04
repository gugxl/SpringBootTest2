package com.example.demo;

import com.example.demo.pojo.MyBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author gugu
 * @Classname ReadValueFromPropertySource
 * @Description TODO
 * @Date 2022/9/4 16:06
 */
@PropertySource("classpath:beanName.properties")
@Configuration
public class ReadValueFromPropertySource {
    @Value("bean.name.component")
    String beanName;

    @Bean("myTestBean")
    public MyBean myBean(){
        return new MyBean(beanName);
    }

}
