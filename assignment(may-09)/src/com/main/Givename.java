package com.main;

import com.model.Displayname;

public class Givename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Displayname  displayname = new Displayname();
		//1st question print
		System.out.println("welcome Mr/ Mrs : Sudheer");
		//2nd question gave input and print
		displayname.setName("Sudheer");
		System.out.println("welcome Mr/ Mrs : " + displayname.getName() );
		
		displayname = null;
	}

}
