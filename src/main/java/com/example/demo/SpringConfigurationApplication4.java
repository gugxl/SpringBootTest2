package com.example.demo;

import com.example.demo.pojo.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gugu
 * @Classname SpringConfigurationApplication4
 * @Description TODO
 * @Date 2022/9/4 16:10
 */
public class SpringConfigurationApplication4 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReadValueFromPropertySource.class);
        MyBean myBean = (MyBean) context.getBean("myTestBean");
        System.out.println("myBean = " + myBean);
    }
}
