package main;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import model.Employ;

public class EmploySort  {

	public static void main(String[] args) {
		Employ employ1 = new Employ(101, "kiran", 30,1000);
		Employ employ2 = new Employ(102, "apple", 35,2000);
		Employ employ3 = new Employ(103, "balukiran", 10,3000);
		Employ employ4 = new Employ(104, "kumar", 24,8900);
		
		/*//int[] var = new int[5];
		*Employ[] employs = new Employ[4];
		*employs[0] = employ1;
		*employs[1] = employ2;
		*employs[2] = employ3;
		*employs[3] = employ4;
		
		*Arrays.sort(employs);*/
		Set<Employ> var = new TreeSet();
		var.add(employ1);
		var.add( employ2);
		var.add(employ3);
		var.add(employ4);
		
	for (Employ employ : var) {
		System.out.println(employ.getEmpAge());
	}	

	}


}
