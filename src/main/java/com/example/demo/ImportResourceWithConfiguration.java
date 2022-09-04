package com.example.demo;

import com.example.demo.pojo.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author gugu
 * @Classname ImportResourceWithConfiguration
 * @Description TODO
 * @Date 2022/9/4 16:31
 */
@Configuration
@ImportResource("classpath:importResources.xml")
public class ImportResourceWithConfiguration {
//    @Autowired
//    private TestService service;
//
//    public void getImportResource(){
//        new TestService();
//    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportResourceWithConfiguration.class);
        context.getBean("testService");
    }
}
