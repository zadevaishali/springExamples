package org.primepro;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext3.xml");
		Student stud=context.getBean("student",Student.class);
		Set<Subject> subjects=stud.getSubjects();
		System.out.println(stud.getSid()+"\t"+stud.getName()+"\t"+stud.getAddress());
		
		System.out.println("The subjects are:");
		for(Subject subject:subjects)
		{
			System.out.println(subject.getSubjectName()+"\t"+subject.getDuration());
		}
	}

}
