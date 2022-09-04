package com.example.demo;

import com.example.demo.pojo.CustomerBo;
import com.example.demo.pojo.SchedulerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gugu
 * @Classname ImportWithConfiguration
 * @Description TODO
 * @Date 2022/9/4 16:21
 */
public class ImportWithConfiguration {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerBo customerBo = (CustomerBo) context.getBean("testCustomerBo");
        customerBo.printMsg("System out println('get from customerBo')");

        SchedulerBo schedulerBo = (SchedulerBo) context.getBean("testSchedulerBo");
        schedulerBo.printMsg("System out println('get from schedulerBo')");

    }
}
