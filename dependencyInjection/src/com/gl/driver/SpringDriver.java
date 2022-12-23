package com.gl.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.services.Teacher;
import com.gl.servicesimpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		//1. Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. Retrieve bean from the container
		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class);//pass the bean id and class name with .class extension
		Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);
		
		if(teacher == teacher2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println(teacher);
		System.out.println(teacher2);
		//3. Call methods on bean
		System.out.println(teacher.homework());
		
		//4. Close the context
		context.close();
	}

}
