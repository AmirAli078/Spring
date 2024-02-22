package com.spring;

import com.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    Laptop lap=context.getBean(Laptop.class);
    //lap.run();
       // Laptop lap1=context.getBean(Laptop.class);
       // lap1.run();
        Programmer pro=context.getBean(Programmer.class);
        System.out.println(pro.getAge());
    }
}
