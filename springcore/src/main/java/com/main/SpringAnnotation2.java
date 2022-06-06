package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Address;
import com.service.Student;

public class SpringAnnotation2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Address address = (Address) applicationContext.getBean("abc");
		Student student = (Student) applicationContext.getBean("student");
		//System.out.println(student.getAddress().getCity());

	}

}
