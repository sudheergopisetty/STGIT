package com.main;

import java.util.List;

import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class LogInBYName {

	public static void main(String[] args) {
		UserDao usert = new UserDaoImpl();	
		
	  	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter User Name");
			String name = scanner.next();
			name = name.toLowerCase();
			 List<User> coll= usert.readByUserName(name);
			 coll.stream().forEach((arg) -> { 
				  System.out.println(arg); 
				  });
			
			
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
