package day1.Model;

public abstract class Employe {
		int empId;
		String empName;
		float Salary;
		String empType;
		
		public Employe() {
			this.empId = 101;
			this.empName = "Sudheer";
			this.Salary = 12000;
			this.empType = "Permanent";
		}
		
		public Employe(int empId, String empName, float Salary, String empType) {
			this.empId = empId;
			this.empName = empName;
			this.Salary = Salary;
			this.empType = empType;
		}
		
		public float getSalary() {
			return Salary;
		}

		public void setSalary(float salary) {
			Salary = salary;
		}

		public String getEmpType() {
			return empType;
		}

		public void setEmpType(String empType) {
			this.empType = empType;
		}

		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public abstract int add(int a, int b);

		public float empSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
	}


