package org.primepro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext1.xml");
		Emp1 e=context.getBean("e", Emp1.class);
		Address address=e.getAddress();
		System.out.println(e.getEno()+"\t"+e.getName());
		System.out.println(address.getDno()+"\t"+address.getStreetName()+"\t" + address.getLoc());

	}

}
