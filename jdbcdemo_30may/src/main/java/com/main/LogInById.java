package com.main;

import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class LogInById {

	public static void main(String[] args) {
		UserDao usert = new UserDaoImpl();	
		  	try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter User Id");
				int id = scanner.nextInt();

				User userInput = usert.readByUserId(id);
				int i = userInput.getUser_id();
				String nam  = userInput.getUserName();
				
				System.out.println("User Id " + i +"   User Name " + nam);
			}catch(Exception e) {
				e.getMessage();
			}
		
	
		
		

	}

}
