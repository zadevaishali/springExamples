package org.primepro;

import org.primepro.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Controller controller=context.getBean("controller", Controller.class);
		controller.controller();

	}

}
