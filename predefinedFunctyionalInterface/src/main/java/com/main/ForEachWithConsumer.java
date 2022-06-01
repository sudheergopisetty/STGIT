package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employe;

public class ForEachWithConsumer {

	public static void main(String[] args) {
		List<Employe> employes = new ArrayList();
		employes.add( new Employe(10, "babu", 10000));
		employes.add( new Employe(20, "lalu", 20000));
		employes.forEach((a) ->{
			System.out.println(a.getEmployeNo());
			System.out.println(a.getEmployName());
		}  );


	}

}
