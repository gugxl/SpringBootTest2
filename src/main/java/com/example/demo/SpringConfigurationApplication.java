package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gugu
 * @Classname SpringConfigurationApplication
 * @Description TODO
 * @Date 2022/9/4 15:26
 */
public class SpringConfigurationApplication {
    public static void main(String[] args) {
//                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        // 因为我们加载的@Configuration 是基于注解形式的，所以需要创建AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册MyConfiguration 类并刷新bean 容器。
        context.register(MyConfiguration.class);
        context.refresh();
    }
}
