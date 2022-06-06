package com.main;

import java.util.Scanner;

import com.model.User;
import com.service.DbWorks;
import com.service.DbWorksImpl;
public class DbMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name ");
		String name = scan.nextLine();
		
		System.out.println("Enter password ");
		String password = scan.nextLine();
		DbWorks dbWorks = new DbWorksImpl();
		User user = dbWorks.createUser(name,password);
		if(user!=null) {
			System.out.println(user);
		}else {
			System.out.println("dommmm");
		}
		
		scan.close();
	}

}
