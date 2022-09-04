package com.example.demo;

import javax.inject.Inject;
import javax.sql.DataSource;

import com.example.demo.pojo.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

/**
 * @author gugu
 * @Classname AppConfig
 * @Description TODO
 * @Date 2022/9/4 16:21
 */
@Configuration
public class AppConfig2 {
    @Inject
    DataSource dataSource;
    @Bean
    public MyBean myBean(){
        return new MyBean(dataSource.toString());
    }

    @Configuration
    static class DataConfig {
        @Bean
        DataSource dataSource(){
            return new EmbeddedDatabaseBuilder().build();
        }
    }

}
