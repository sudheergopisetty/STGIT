package com.Main;

import com.Model.Department;
import com.Model.Employeeee;
import com.service.CheckEmploy;

public class Hrapp {

	public static void main(String[] args) {
		
	  Employeeee employeeee1 = new Employeeee(); // default constructor
	  employeeee1.setEmpId(101);
	  employeeee1.setEmpName("ram"); 
	  employeeee1.setEmpSalary(12000);
		 
		
		Employeeee employeeee2 = new Employeeee();
		employeeee2.setEmpId(102);
		employeeee2.setEmpName("balu");
		employeeee2.setEmpSalary(12000);
		
		Employeeee employeeee3 = new Employeeee();
		employeeee3.setEmpId(103);
		employeeee3.setEmpName("balu");
		employeeee3.setEmpSalary(12000);
		
		Employeeee employeeee4 = new Employeeee(104,"sudheer",10000);
		Employeeee employeeee5 = new Employeeee(105, "null", 0);
		
		Department department1 = new Department();
		department1.setDeptId(10);
		department1.setDeptName("Developper");
		//department1.setEmployeeee(employeeee2);
		
		
		//System.out.println("Dept number :" + department1.getDeptId());
		//System.out.println("DEpt Name : " + department1.getDeptName());
		//department1.setEmployeeee(null);
		
		
		//System.out.println("Employ id "+department1.getEmployeeee().getEmpId());
		
		
		Employeeee[] empList = new Employeeee[5]; 
		empList[0] = employeeee1;
		empList[1] = employeeee2;
		empList[2] = employeeee3;
		empList[3] = employeeee4;
		empList[4] = employeeee5;
		
		department1.setEmployeeee(empList);
		//Employeeee[] arrOfEmp = department1.getEmployeeee();
		/*
		 * for (int i = 0; i < arrOfEmp.length; i++) {
		 * System.out.println(arrOfEmp[i].getEmpId()); }
		 */
		/*
		 * for (int i = 0; i < empList.length; i++) {
		 * System.out.println(empList[i].getEmpId()); }
		 */
		
		CheckEmploy  checkEmploy = new CheckEmploy();
		/*
		 * boolean ans = checkEmploy.getEmp(department1,105); System.out.println(ans);
		 */
		
		Employeeee[] re = checkEmploy.getArrayName(department1, "balu");
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i].getEmpId());
		}
	}

}
