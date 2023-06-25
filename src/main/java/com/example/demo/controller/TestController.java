package com.example.demo.controller;

import com.example.demo.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/test")
public class TestController {
    @Autowired
    private UserManager userManager;

    /**
     *
     * @return
     */
    @RequestMapping("/async")
    public String testAsync(){
        return userManager.testAsync();

    }

    @RequestMapping("/sync")
    public String testSync(){
        return userManager.testSync();

    }
}
