package com.main;

import java.util.function.Predicate;

import com.model.Employe;

public class PredicateMain {

	public static void main(String[] args) {
		Predicate<Employe> predicate = ( emp) -> {
			if(emp.getSalary() > 5000) {
				return true;
			}else {
			return false;
			}
		};
		boolean ans = predicate.test(new Employe(10, "babu", 20000));
		
		System.out.println(ans);
	}

}
