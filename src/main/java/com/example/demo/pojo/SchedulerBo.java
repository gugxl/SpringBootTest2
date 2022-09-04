package com.example.demo.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gugu
 * @Classname SchedulerBo
 * @Description TODO
 * @Date 2022/9/4 16:20
 */
@Configuration
public class SchedulerBo {
    public void printMsg(String msg){
        System.out.println("SchedulerBo : " + msg);
    }

    @Bean
    public SchedulerBo testSchedulerBo(){
        return new SchedulerBo();
    }

}
