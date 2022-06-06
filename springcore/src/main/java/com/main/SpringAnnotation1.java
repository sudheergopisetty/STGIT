package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Address;

public class SpringAnnotation1 {

	public static void main(String[] args) {
		// interface var = new interfaceImpl
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Address.class);
		//Address address = (Address) applicationContext.getBean("address");
		Address address = (Address) applicationContext.getBean("abc");
		address.setCity("Brooklyn");
		System.out.println(address.getCity());
		

	}

}
