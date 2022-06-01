package model;

// pojo file private variable + constructor + getter + setters
public class Student {
	private int studentId;
	private String studentName;
	private int age;
	private int marks;
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, int age, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", marks=" + marks
				+ "]";
	}

	

}
