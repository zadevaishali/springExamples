package org.primepro;

import org.primepro.beans.Emp;
import org.primepro.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 Emp e=context.getBean("emp", Emp.class);
		 System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		 }

	}


