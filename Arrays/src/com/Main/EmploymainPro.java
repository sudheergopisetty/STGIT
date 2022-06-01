package com.Main;

import com.Model.Employe;
import com.Service.BusinessLogicService;

public class EmploymainPro {

	public static void main(String[] args) {
		Employe employe1 = new Employe();
		employe1.setEmpId(101);
		employe1.setEmpName("Ram");
		employe1.setSalary(12000);
		
		Employe employe2 = new Employe();
		employe2.setEmpId(102);
		employe2.setEmpName("Balu");
		employe2.setSalary(10000);
		
		Employe employe3 = new Employe();
		employe3.setEmpId(103);
		employe3.setEmpName("Adi");
		employe3.setSalary(16000);
 
		
		// create an array 
		// int[] intvar = new int[size]
		
		Employe[] employes = new Employe[3];
		employes[0] = employe1;
		employes[1] = employe2;
		employes[2] = employe3;
		
		BusinessLogicService logicService = new BusinessLogicService();
		/*
		 * boolean d = logicService.searchByEmployId(employes, 101); if (d == true) {
		 * System.out.println("Employ is present"); } else {
		 * System.out.println("Employ is not present");
		 * 
		 * }
		 */
		/*
		 * long salarySum = logicService.sumEmploy(employes);
		 * System.out.println("sum of salaries :" +salarySum);
		 */
		
		Employe[]  vae = logicService.sumEmp(employes);
		for (int i = 0; i < vae.length; i++) {
			System.out.println(vae[i].getEmpName());
		}
	}

}
