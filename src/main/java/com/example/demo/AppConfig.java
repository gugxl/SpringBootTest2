package com.example.demo;

import com.example.demo.pojo.CustomerBo;
import com.example.demo.pojo.SchedulerBo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author gugu
 * @Classname AppConfig
 * @Description TODO
 * @Date 2022/9/4 16:21
 */
@Configuration
@Import(value = {CustomerBo.class, SchedulerBo.class})
public class AppConfig {
}
