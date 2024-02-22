package com.spring.config;

import com.spring.Laptop;
import com.spring.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
//@Bean(name="lap")
    //@Bean(name={"lap1","lap2"})
   // @Bean
   // @Scope("prototype")   //scope of the object default is singleton
//    public Laptop laptop(){
//        return new Laptop();
//    }
//@Bean
//    public Programmer programmer( Laptop lap){
//    Programmer obj=new Programmer();
//    obj.setAge(25);
//    obj.setLap(lap);
//        return obj;
//    }

}
