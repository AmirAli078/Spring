package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public Laptop(){
        System.out.println("Laptop object is created");
    }
    public void run(){
        System.out.println("run method is called..");
    }
}
