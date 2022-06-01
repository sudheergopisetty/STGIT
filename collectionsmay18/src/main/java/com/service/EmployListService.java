package com.service;

import java.util.Iterator;
import java.util.List;

import com.model.EmployAddress;
import com.model.EmployDepartment;

public class EmployListService {
	
	
	public static void  getHouseDetails(List House) {
		
		for (Iterator iterator = House.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			
			if (object instanceof EmployDepartment) {
				EmployDepartment new_name = (EmployDepartment) object;
				System.out.println(new_name.getEmployId());
			}
		
			if (object instanceof EmployAddress) {
				EmployAddress new_name1 = (EmployAddress) object;
				System.out.println(new_name1.getHouseId());
			}
			
			if (object instanceof Integer) {
				Integer new_name2 = (Integer) object;
				System.out.println(new_name2.intValue());
			}
		
	}

}
}
