package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.SorrtByMark;
//import model.SortByAge;
import model.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1, "s", 20, 50);
		Student student2 = new Student(2, "u", 22, 28);
		Student student3 = new Student(3, "d", 24, 63);
		Student student4 = new Student(3, "h", 19, 26);
		Student student5 = new Student(4, "e", 21, 30);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Collections.sort(students, new SorrtByMark());
		
		for (Student student : students) {
			System.out.println("studentId : "+ student.getStudentId());
			System.out.println("studentName : "+ student.getStudentName());
			System.out.println("studentAge : "+ student.getAge());
			System.out.println("studentMarks : "+ student.getMarks());
			
		}

	}

}
