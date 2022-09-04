package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gugu
 * @Classname SpringConfigurationApplication2
 * @Description TODO
 * @Date 2022/9/4 15:35
 */
public class SpringConfigurationApplication2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    }
}
