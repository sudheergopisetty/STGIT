package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.model.Address;
@Configuration
@Service
@PropertySource("classpath:/abc.properties")
public class Student {
	@Value(value="${apple}")
	private int studNo;
	@Autowired
	private Address address; //DI

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSudNo() {
		return studNo;
	}
	@Value(value="33")
	public void setSudNo(int studNo) {
		this.studNo = studNo;
	}

	public Student(@Value(value="22")  int studNo) {
		super();
		this.studNo = studNo;
		//System.out.println("With one param "+ studNo);
	}

}
