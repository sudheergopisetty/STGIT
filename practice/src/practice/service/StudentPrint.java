package practice.service;

import practice.main.StudentInitiate;

public class StudentPrint {
	StudentInitiate initiate = new StudentInitiate();
	public String nah(StudentInitiate ele) {
		
		return ele.getAge() +"\n"+ ele.getName();
	}
}
