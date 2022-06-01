
public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ employee1 = new Employ();
		employee1.empId = 101;
		employee1.empName = "fddhdfhg";
		employee1.salary=10000;
		
		Employ employee2 = new Employ();
		employee2.empId = 102;
		employee2.empName = "fddhdfhg";
		employee2.salary=15000;
		
		if(employee1.salary >employee2.salary) {
			System.out.println("1 salary is "+employee1.salary );
		}else if(employee2.salary >employee1.salary) {
			System.out.println("2 salary is "+employee2.salary);
		}else {
			System.out.println("1 and 2 salary is "+employee1.salary);
		}
	}
	
}
