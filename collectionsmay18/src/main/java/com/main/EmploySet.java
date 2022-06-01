package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.EmployAddress;
import com.model.EmployDepartment;

public class EmploySet {

	private static final EmployDepartment New = null;

	public static void main(String[] args) {
		// interface interfacename   =New interfaceimpl;
		EmployDepartment department1 = new EmployDepartment(10,"balu");
		EmployDepartment department2 = new EmployDepartment(20,"kiran");
		EmployDepartment department3 = new EmployDepartment(30,"sobhan");
		
		Set set = new HashSet();
		set.add(department1);
		/*
		 * set.add(department2); set.add(department3);
		 */
		
		EmployAddress address1 = new EmployAddress(12, "bala nagar", "chennai");
		EmployAddress address2 = new EmployAddress(120, "gandhi nagar", "manglore");
		EmployAddress address3 = new EmployAddress(147, "MGR Road", "hyderabad");
		
		Set setOfAdd = new HashSet();
		setOfAdd.add(address1);
		setOfAdd.add(address2);
		setOfAdd.add(address3);
		department1.setAddressss(setOfAdd);
		
	System.out.println("set afteradd" + set.size());
	//set.add(department3);
	System.out.println("set afteradd duplicate" + set.size());
	//set.remove(department3);
	System.out.println("set afteradd" + set.size());
	
	//set.add(22);  // auto convert premitive data type to object
	
	for (Iterator iterator = set.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		 if (object instanceof EmployDepartment)  { 
			 EmployDepartment new_name = (EmployDepartment) object; 
		 System.out.println(new_name.getEmployId()); 
		 
		 Set addres = new_name.getAddressss();
		 for (Iterator iterator2 = addres.iterator(); iterator2.hasNext();) {
			 EmployAddress object2 = (EmployAddress) iterator2.next();
			System.out.println(object2.getCity());
		}
		 }
		 
			
		
		/*
		 * if (object instanceof EmployDepartment) { EmployDepartment new_name =
		 * (EmployDepartment) object; System.out.println(new_name.getEmployId()); }
		 * 
		 * if (object instanceof EmployAddress) { EmployAddress new_name1 =
		 * (EmployAddress) object; System.out.println(new_name1.getHouseId()); }
		 * 
		 * if (object instanceof Integer) { Integer new_name2 = (Integer) object;
		 * System.out.println(new_name2.intValue()); }
		 */
	}
	
	}

	private static void HashSet() {
		// TODO Auto-generated method stub
		
	}

}
