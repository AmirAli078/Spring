package com.spring;
public class Programmer {
    private int age;
    Laptop lap;
    public Programmer(){
        System.out.println("Object is created....");
    }

    public Programmer(int age,Laptop lap){
        System.out.println("para constructor is called ");
        this.age=age;
        this.lap=lap;
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

    public void run(){
        System.out.println("code is running...");
        lap.compile();
    }
}
