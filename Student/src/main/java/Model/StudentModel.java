package Model;

public class StudentModel {
	private int studentId;
	private String studentName;
	private int collegeFee;
	private String studentBranch;
	
	
	
	public StudentModel() {
		this.studentId = 100;
	    this.studentName = "balu";
		this.studentBranch = "cse";
		this.collegeFee = 20000;
		
	}
	
	public StudentModel(int studentId,String studentName,String studentBranch,int collegeFee) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.collegeFee = collegeFee;
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

	public int getCollegeFee() {
		return collegeFee;
	}

	public void setCollegeFee(int collegeFee) {
		this.collegeFee = collegeFee;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	
	
	
	
}
