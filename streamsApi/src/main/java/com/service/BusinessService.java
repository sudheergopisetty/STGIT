package com.service;

import java.util.List;

import com.model.Employe;

public class BusinessService {
	public long countEmploy(List<Employe> employes, String s) {
		long count = 0;
		for (Employe employe : employes) {
			if(employe.getEmployName().startsWith(s)) {
				count  = count + 1;
			};
			
		}
		return count;         // L long data type
	}

}
