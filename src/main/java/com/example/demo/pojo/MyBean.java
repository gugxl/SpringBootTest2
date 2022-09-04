package com.example.demo.pojo;

/**
 * @author gugu
 * @Classname MyBean
 * @Description TODO
 * @Date 2022/9/4 15:26
 */
public class MyBean {
    String name;

    public MyBean(String name) {
        this.name = name;
    }

    public MyBean(){
        System.out.println("generate MyBean Instance");
    }

    public void init(){
        System.out.println("MyBean Resources Initialized");
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }

}
