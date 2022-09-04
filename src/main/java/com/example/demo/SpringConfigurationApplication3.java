package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gugu
 * @Classname SpringConfigurationApplication3
 * @Description TODO
 * @Date 2022/9/4 15:44
 */
public class SpringConfigurationApplication3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyConfiguration2.class);
        context.refresh();

        // 获取启动过程中的bean 定义的名称
        for(String str : context.getBeanDefinitionNames()){
            System.out.println("str = " + str);
        }
        context.close();

    }
}
