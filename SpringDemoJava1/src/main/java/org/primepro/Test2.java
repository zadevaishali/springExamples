package org.primepro;

import org.primepro.beans.Address;
import org.primepro.beans.Emp;
import org.primepro.config.AppConfig1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig1.class);
		 Emp e=context.getBean("emp", Emp.class);
		 Address address=e.getAddress();
		 System.out.println(e.getEno()+"\t"+e.getName());
		 System.out.println(address.getDno()+"\t"+address.getStreetName()+"\t"+address.getLoc());


	}

}
