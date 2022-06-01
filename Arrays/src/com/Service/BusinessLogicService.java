package com.Service;

import com.Model.Employe;

public class BusinessLogicService {

	public int search(int[] searchArray, int searchEle){
		int count = 0 ;
		for (int i = 0; i < searchArray.length; i++) {
			if ( searchArray[i]== searchEle) {
				count = count + 1;
			}
		}
		return count;
	}

	public int sum(int[] searchArray){
		int coun = 0 ;
		for (int i = 0; i < searchArray.length; i++) {
			coun = coun + searchArray[i];
		}
		return coun;
	}
	
	public boolean searchByEmployId(Employe[] empArray, int id){
		//iterate 
		boolean bool = false;
		for (int i = 0; i < empArray.length; i++) {
			if(empArray[i].getEmpId() == id ) {
				bool = true;
			}
		}
		return bool;
	}
	

	public long sumEmploy(Employe[] employes) {
		
		long coun = 0 ;
		for (int i = 0; i < employes.length; i++) {
			coun = coun + employes[i].getSalary();
		}
		return coun ;
	}
	public Employe[] sumEmp(Employe[] employes) {
			int indes = 0;
			for (int i = 0; i < employes.length; i++) {
				if(employes[i].getSalary() > 2000) {
					indes = indes + 1;
				
				}
			}
			
			int inde2 = 0;
			Employe[] var = new Employe[indes];
			for (int i = 0; i < employes.length; i++) {
				if(employes[i].getSalary() > 2000) {
					var[inde2]= employes[i];
					inde2++;
				}
			}
			
			return var;
		}
	
	
}
