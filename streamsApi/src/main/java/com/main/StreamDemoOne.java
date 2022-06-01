package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employe;
import com.service.BusinessService;

public class StreamDemoOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employe> employes = new ArrayList();
		employes.add( new Employe(10, "babu", 10000));
		employes.add( new Employe(20, "lalu", 20000));
		
		/*
		 * long var = employes.stream().filter((a) ->
		 * a.getEmployName().startsWith("b")).count();
		 * 
		 * System.out.println(var);
		 */
		
	employes.stream().filter((a) -> a.getEmployName().startsWith("b")).forEach(System.out :: println);
		/*
		 * BusinessService businessService = new BusinessService(); long l =
		 * businessService.countEmploy(employes,"b");
		 * 
		 * if(1 > 0) { System.out.println("Name with b " + l); }else {
		 * System.out.println("There is no data"); }
		 */

	}

}
