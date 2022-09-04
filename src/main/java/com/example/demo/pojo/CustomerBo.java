package com.example.demo.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gugu
 * @Classname CustomerBo
 * @Description TODO
 * @Date 2022/9/4 16:17
 */
@Configuration
public class CustomerBo {
    public void printMsg(String msg){
        System.out.println("CustomerBo : " + msg);
    }

    @Bean
    public CustomerBo testCustomerBo(){
        return new CustomerBo();
    }
}
