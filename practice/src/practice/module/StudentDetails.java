package practice.module;

import practice.main.StudentInitiate;
import practice.service.StudentPrint;

public class StudentDetails {

	public static void main(String[] args) {
		StudentInitiate studentInitiate = new StudentInitiate();
		studentInitiate.setName("ram");
		studentInitiate.setAge(26);
		
		StudentPrint studentPrint = new StudentPrint();
		System.out.println(studentPrint.nah(studentInitiate));
	}

}
