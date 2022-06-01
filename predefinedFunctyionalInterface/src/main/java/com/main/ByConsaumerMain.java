package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.model.Employe;

public class ByConsaumerMain {

	public static void main(String[] args) {
		 BiConsumer<String, Integer> biConsumer = (str,intVar) ->{
			System.out.println("String value " + str);
			System.out.println("Interger value " + intVar);
		};
		biConsumer.accept("Happy", 23); // default method
		
		List<Employe> employes = new ArrayList();
		employes.add( new Employe(10, "babu", 10000));
		employes.add( new Employe(20, "lalu", 20000));
		//Employe employe3 = new Employe(30, "babu", 50000);
		//Employe employe4 = new Employe(40, "babu", 30000);
		
		BiFunction<List<Employe>, String , Employe> biFunction = (employeList, nameToSearch) ->{
			// logic to search the given employ in the collection
			Employe empTmp = null;
			for (Employe employe : employeList) {
				if(employe.getEmployName().equals(nameToSearch)) {
					empTmp = employe;
				}
				
			}
			return empTmp;
		};
		
		Employe employe = biFunction.apply(employes, "babu");
		if(employe != null) {
			System.out.println("emp no : " + employe.getEmployeNo());
			System.out.println("emp name : " + employe.getEmployName());
		}else {
			System.out.println("emp no  " );
		}
	}

}
