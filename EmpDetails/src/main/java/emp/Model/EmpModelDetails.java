package emp.Model;

public class EmpModelDetails {
		private int empId;
		private String empName;
		private float empSalary;
		private String empType ;
		
		
		public EmpModelDetails() {
			this.empId = 100;
			this.empName = "Sudheer";
			this.empSalary = 10000;
			this.empType = "permanent";
		}
		
		public EmpModelDetails(int empId, String empName, float empSalary, String empType) {
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.empType = empType;
			
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

		public float getEmpSalary() {
			return empSalary;
		}

		public void setEmpSalary(float empSalary) {
			this.empSalary = empSalary;
		}

		public String getEmpType() {
			return empType;
		}

		public void setEmpType(String empType) {
			this.empType = empType;
		}
		
		
}
