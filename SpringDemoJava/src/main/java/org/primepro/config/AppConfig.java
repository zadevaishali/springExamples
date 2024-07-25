package org.primepro.config;

import org.primepro.beans.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class AppConfig
{
  @Bean(name= "emp")
     public Emp employee()
   {
     Emp e=new Emp();
     e.setEno(1);
     e.setName("Vaishali");
     e.setAddress("Hyderabad"); 
     return e;
   }
}


