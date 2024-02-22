package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Programmer {
    private  int age;
    private Laptop lap;
    public Programmer(){
        System.out.println("Programmer class object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
