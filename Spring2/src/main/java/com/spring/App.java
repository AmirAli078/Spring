package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
     //  context.refresh();
        Programmer obj= (Programmer) context.getBean("programmer");
      //  obj.setAge(21);
        System.out.println(obj.getAge());
        obj.run();

//        Programmer obj1= (Programmer) context.getBean("programmer");
//       // obj1.run();
//        System.out.println(obj1.age);
    }
}
