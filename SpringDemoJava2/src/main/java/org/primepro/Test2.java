package org.primepro;

import java.util.List;

import org.primepro.config.AppConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);
		 College college=context.getBean("college", College.class);
		 List<String> courses=college.getCourses();
		 System.out.println(college.getCid()+"\t"+college.getCollegeName());
		 System.out.println("The courses are:");
		 for(String course:courses)
		  
		 System.out.println(course);

	}
}


