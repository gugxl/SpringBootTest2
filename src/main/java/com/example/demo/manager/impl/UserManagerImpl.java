package com.example.demo.manager.impl;

import com.example.demo.manager.UserManager;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl implements UserManager {
    @Override
    @Async
    public String testAsync() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "testAsync";
    }

    @Override
    public String testSync() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "testSync";
    }
}
