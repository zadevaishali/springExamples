package org.primepro;

import org.primepro.config.AppConfig;
import org.primepro.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Controller controller =context.getBean("controller",Controller.class);
		controller.controller();
	}

}
