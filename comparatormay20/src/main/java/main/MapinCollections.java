package main;

import model.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class MapinCollections {

	public static void main(String[] args) {
		Student student1 = new Student(111, "s", 20, 50);
		Student student2 = new Student(2, "u", 22, 28);
		Student student3 = new Student(3, "d", 24, 63);
		Student student4 = new Student(3, "h", 19, 26);
		Student student5 = new Student(4, "e", 21, 30);
		
		Map<String,Student> map = new HashMap<String,Student>();
		
		map.put("a", student1);
		map.put("b", student2);
		map.put("c", student3);
		map.put("d", student4);
		map.put("f", student5);
		
		Student student = map.get("b");
		System.out.println("studentId : "+ student.getStudentId());
		System.out.println("studentName : "+ student.getStudentName());
		System.out.println("studentAge : "+ student.getAge());
		System.out.println("studentMarks : "+ student.getMarks());
		
		
		Map<Integer,Student> map2 = new HashMap<Integer,Student>();
		map2.put(student1.getStudentId(), student1);// auto boxing primitive to object
		//map2.put(2, new Integer(2),student2);// convert primitive to object is called wrapper class
		map2.put(student2.getStudentId(), student2);
		map2.put(student3.getStudentId(), student3);
		map2.put(student4.getStudentId(), student4);
		map2.put(student5.getStudentId(), student5);
		
		
		Student studenttemp = map2.get(student2.getStudentId());
		System.out.println("studentId : "+studenttemp.getStudentId());
		System.out.println("studentName : "+ studenttemp.getStudentName());
		System.out.println("studentAge : "+ studenttemp.getAge());
		System.out.println("studentMarks : "+ studenttemp.getMarks());
		
		System.out.println("iterate");
		
		for(Map.Entry<String, Student> asp: map.entrySet()) {
			String  key = asp.getKey();
			System.out.println(map.get(key));
		}
		
	}

}
