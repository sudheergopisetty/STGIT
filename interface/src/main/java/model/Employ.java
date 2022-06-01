package model;

public class Employ implements Comparable<Employ>{
	private int empId;
	private String empName;
	private int empAge;
	private int salary;
	public Employ() {
		super();
	}
	public Employ(int empId, String empName, int empAge,int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
     @Override
     public int compareTo(Employ o)
     {
    	 if(empAge==o.empAge) 
    		 return 0;
	 else if(empAge>o.empAge) 
		 return 1; 
	 else 
		 return -1; 
    	 }
	 
	
}
