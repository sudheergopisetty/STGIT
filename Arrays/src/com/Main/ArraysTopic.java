package com.Main;

import com.Service.BusinessLogicService;

public class ArraysTopic {

	public static void main(String[] args) {
		//int[] var = {0,1,2,3,4,5};
		int[] var = new int[5];
		var[0]=10;
		var[1]=20;
		var[2]=30;
		var[3]=20;
		var[4]=30;
		  BusinessLogicService logicService = new BusinessLogicService(); 
		  int result = logicService.search(var, 20);
		  System.out.println("How many times it is present "+ result); 
		  int resultsum = logicService.sum(var); 
		  System.out.println("sum of array "+resultsum);
		 
	}

}
